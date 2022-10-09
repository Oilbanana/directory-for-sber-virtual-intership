package sber.directory;

public class City {
    String  name;
    String region;
    String district;
    int population;
    String foundation;

    public City (String name, String region, String district, int    population, String foundation){
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getDistrict() {
        return district;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
     return "Name = " + this.name + " Region = " + this.region + " District = " + this.district + " Population = " + this.population + " Foundation = " + this.foundation;
    }
}
