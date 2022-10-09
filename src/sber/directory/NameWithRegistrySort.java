package sber.directory;

import java.util.Comparator;

public class NameWithRegistrySort implements Comparator<City> {
    public static Comparator nameWithRegistryComporator = new NameWithRegistrySort();
    @Override
    public int compare(City city1, City city2) {
        return city1.getName().toLowerCase().compareTo(city2.getName().toLowerCase());
    }
}
