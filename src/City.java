public class City {
    int number;
    String  name;
    String region;
    String district;
    int population;
    int foundation;

    public City (int number, String name, String region, String district, int population, int foundation){
        this.number = number;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }
    @Override
    public String toString() {
     return "Name = " + this.name + "Region = " + this.region + "District = " + this.district + "Population = " + this.population + "Foundation = " + this.foundation;
    }
}
