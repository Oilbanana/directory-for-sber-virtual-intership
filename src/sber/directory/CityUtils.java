package sber.directory;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CityUtils {
    public static ArrayList<City> cityArrayList = new ArrayList<>();
    public static ArrayList<City> parse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь до справочника в текстовом формате ");
        String fileName = scan.nextLine();
        Path pathToFile = Paths.get(fileName);
        try (Scanner scanFile = new Scanner (pathToFile)) {
            scanFile.useDelimiter(System.getProperty("line.separator"));
            while (scanFile.hasNext()) {
                cityArrayList.add(parseFileString(scanFile.nextLine()));
            }
        }
        catch (Exception e ){
            System.out.println("Exception " + e);
        }
        return cityArrayList;
    }
    public static void  print (ArrayList<City> cityArrayList){
        for (var city: cityArrayList){
            System.out.println(city);
        }
    }
    public static  City parseFileString (String str){
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter(";");
        scanner.skip("\\d*");
        String name = scanner.next();
        String region = scanner.next();
        String district = scanner.next();
        int population =  scanner.nextInt();
        String foundation = null;

        if (scanner.hasNext()) {
            foundation = scanner.next();
        }

        scanner.close();
        return new City(name,region,district,population,foundation);
    }
}

