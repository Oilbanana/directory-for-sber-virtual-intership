package sber.directory;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.*;

public class CityUtils {
    protected static ArrayList<City> cityArrayList = new ArrayList<>();
    protected static ArrayList<City> parse(){
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
    protected static void  print (ArrayList<City> cityArrayList){
        for (var city: cityArrayList){
            System.out.println(city);
        }
    }
    protected static  City parseFileString (String str){
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
    protected static void findMax(ArrayList<City> cities){
        City[] buffer = new City[cities.size()];
        cities.toArray(buffer);
        City current = buffer[0];
        int maxIndex = 0;

        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i].getPopulation() > current.getPopulation() ){
                current = buffer[i];
                maxIndex = i;
            }
        }
        System.out.println(MessageFormat.format("[{0}] = {1}", maxIndex, buffer[maxIndex]));
    }

    protected static void  findAmountOfCities(ArrayList<City> cities){
         Map<String,Integer> amountOfCities = new HashMap<>();
         for (City city : cities){
             if(!amountOfCities.containsKey(city.getRegion())){
                 amountOfCities.put(city.getRegion(),1);
             }
             else{
                 amountOfCities.put(city.getRegion(),amountOfCities.get(city.getRegion())+1);
             }
         }
         for (var amount : amountOfCities.keySet()){
             System.out.println( amount + " = " +  amountOfCities.get(amount));
         }
        }
}

