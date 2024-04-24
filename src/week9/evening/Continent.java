package week9.evening;

public class Continent {
    public String name;
    public double avgTemp;

    public Continent(String name, double avgTemp) {
        this.name = name;
        this.avgTemp = avgTemp;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", avgTemp=" + avgTemp +
                '}';
    }
}
