import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    protected static ArrayList<City> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanPath = new Scanner(System.in);
        System.out.println("Введите путь до справочника в текстовом формате ");
        String fileName = scanPath.nextLine();
        Path pathToFile = Path.of(fileName);

         try (Scanner scanFile =  new Scanner (pathToFile)){
             while (scanFile.hasNext()){
                 System.out.println();
             }
         }
        catch (Exception e ){
            System.out.println("Возникло исключение " + e);
        }
    }
    public static  City parseFileString (String str){
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter("\\s*,\\s*");
        int number = scanner.nextInt();
        String name = scanner.next();
        String region = scanner.next();
        String district = scanner.next();
        int population =  scanner.nextInt();
        int foundation = scanner.nextInt();
    }
}
