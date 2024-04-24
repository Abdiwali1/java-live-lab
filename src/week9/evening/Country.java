package week9.evening;

public class Country {

    public static double worldPopulation; // unit billions
    public static double worldCo2Level; // unit ppm

    public String name;
    public double population;
    public Continent continent;

    static {
        worldPopulation = 7.88;
        worldCo2Level = 417.83;
    }

    public Country(String name, double population, Continent continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
}
/*
1. Country [static, instance, class, object]

    Create a class Country
    define these static variables:
        world population - 7.88 billion - represent billions
        world co2 level - 417.83 - represents the unit is ppm (parts per million)

    define these instance variables:
         name, population, continent

    create a static block to initialize the static variables
    create a constructor to initialize the instance variables
    create a different class to test the Country objects and static variables
 */