package week9.evening;

public class TestCountry {
    public static void main(String[] args) {

        Country us = new Country("US", 10, new Continent("North America", 72));
        System.out.println(us);

        Country uk = new Country("UK", 10, new Continent("Europe", 70));
        System.out.println(uk);

        System.out.println(uk.continent.name);
        System.out.println(uk.continent.avgTemp);

        System.out.println(Country.worldPopulation);
        System.out.println(Country.worldCo2Level);


    }
}
