package week9.evening;

public class Hobby {
    private String name;
    private double annualCost;
    private boolean isOutdoors;
    private boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing " + name + " " + (isOutdoors ? "outside" : "inside"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualCost() {
        return annualCost;
    }

    public void setAnnualCost(double annualCost) {
        this.annualCost = annualCost;
    }

    public boolean isOutdoors() {
        return isOutdoors;
    }

    public void setOutdoors(boolean outdoors) {
        isOutdoors = outdoors;
    }

    public boolean isRequiresOthers() {
        return requiresOthers;
    }

    public void setRequiresOthers(boolean requiresOthers) {
        this.requiresOthers = requiresOthers;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}

/*

3. Hobby [classes, constructors, ArrayList]

    create a class called Hobby
        instance variables:
            name, annual cost, is outdoors (boolean), requires others (boolean)

        create these overloaded constructors to initialize all the instance variables:
            - name
            - name, annual cost
            - name, annual cost, is outdoors, requires others

        methods:
            doIt():
                print: Doing $name-of-hobby $outside-or-inside
                    ex: new Hobby("golf", 1000, true, false).doIt() -> Doing golf outside
                    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside

            toString()
                return all the Hobby information

    Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */
