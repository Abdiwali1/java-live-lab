package week9.evening;

public class Workout {

    private String name;
    private double duration;
    private int caloriesBurned;

    public Workout(String name, double duration, int caloriesBurned) {
      setName(name);
      setDuration(duration);
      setCaloriesBurned(caloriesBurned);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(isValid(name)){
            this.name = name;
        }
    }

    private boolean isValid(String str){
        str = str.replace(" ", "");

        for(int i = 0; i < str.length(); i++){
            if(!Character.isLetter(str.charAt(i))){
                return false;
            }
        }

        return !str.isEmpty(); // !false -> true
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if(duration > 0){
            this.duration = duration;
        }
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        if(caloriesBurned > 0 && caloriesBurned <= 1000){
            this.caloriesBurned = caloriesBurned;
        }
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}
/*

2. Workout [Encapsulation, access modifiers, classes, objects, methods]

    Create a class Workout
    define and encapsulate these instance variables:
        name, duration, calories burned

    create a constructor to initialize the variables. Call the setters in the constructor

    in the setters only set the values if they are valid data based on these requirements:
        name: should have only letters and spaces, no other characters type. The name cannot be empty either

        duration: should be more than 0

        calories burned: should be more than 0 and less than 1000

    create another class to test the Workout objects
 */