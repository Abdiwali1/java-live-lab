package week9.morning;

public class Hobby {

    public String name;
    public double annualCost;
    public boolean isOutDoor;
    public boolean requireOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this.name = name;
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutDoor, boolean requireOthers) {
        this.name = name;
        this.annualCost = annualCost;
        this.isOutDoor = isOutDoor;
        this.requireOthers = requireOthers;
    }

    public void doIt(){
        if(isOutDoor){
            System.out.println("Doing " + name + " outside");
        }else {
            System.out.println("Doing " + name + " inside");
        }
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutDoor=" + isOutDoor +
                ", requireOthers=" + requireOthers +
                '}';
    }
}
