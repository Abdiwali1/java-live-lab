package week9.morning;

public class CountryTest {

    static Country brazil = new Country("Brazil",200,"South America");

    public static void main(String[] args) {
        System.out.println("brazil.name = " + brazil.name);
        System.out.println("brazil.population = " + brazil.population);
        System.out.println("brazil.continentInstance = " + brazil.continentInstance);

        System.out.println("Country.worldPopulation = " + Country.worldPopulation);
        System.out.println("Country.continentStatic = " + Country.continentStatic);
        System.out.println("Country.worldCo2Level = " + Country.worldCo2Level);
    }






}
