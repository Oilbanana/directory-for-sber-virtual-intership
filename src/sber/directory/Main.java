package sber.directory;

import java.util.ArrayList;
import java.util.Comparator;

import static sber.directory.CityUtils.*;
import static sber.directory.DistrictSort.*;
import static sber.directory.NameSort.*;
import static sber.directory.NameWithRegistrySort.*;


public class Main {
    public static void main(String[] args){
        parse();
        //System.out.println("1 Сортировка");
        //sortByName(cityArrayList);
        //print(cityArrayList);
        //System.out.println("-----------------------------------------------------------");    // Сделал для удобства
        //System.out.println("2 Сортировка");
        //sortByTwoFields(cityArrayList);
        //print(cityArrayList);
        // findMax(cityArrayList);
        findAmountOfCities(cityArrayList);
    }
    private static void sortByTwoFields (ArrayList<City> cities){
     Comparator<City> compareByTwoFields = districtComporator.thenComparing(nameWithRegistryComporator);
        cities.sort(compareByTwoFields);
    }
}

