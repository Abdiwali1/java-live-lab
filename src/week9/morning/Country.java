package week9.morning;

public class Country {

    public static String continentStatic;
    public static double worldPopulation;
    public static double worldCo2Level;

    public String name;
    public double population;
    public String continentInstance;

    static {
        continentStatic = "North America";
        worldPopulation = 7.88;
        worldCo2Level = 417.83;

    }

    public Country(String name, double population, String continentInstance){
        this.name = name;
        this.population = population;
        this.continentInstance = continentInstance;
    }

}
