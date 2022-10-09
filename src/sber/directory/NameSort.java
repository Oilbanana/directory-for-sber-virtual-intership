package sber.directory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NameSort implements Comparator<City> {
   public static Comparator nameComporator = new NameSort();
    @Override
    public int compare(City city1, City city2) {
        return city1.getName().compareTo(city2.getName());
    }
    public static void sortByName (ArrayList<City> cities){
        cities.sort(nameComporator);
    }
}
