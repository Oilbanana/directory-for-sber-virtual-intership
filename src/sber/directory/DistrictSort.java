package sber.directory;

import java.util.Comparator;

public class DistrictSort implements Comparator<City> {
 public static Comparator districtComporator = new DistrictSort();

    @Override
    public int compare(City city1, City city2) {
        return city1.getDistrict().toLowerCase().compareTo(city2.getDistrict().toLowerCase());
    }
}

