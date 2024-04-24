package week9.morning;

public class Workout {

    private String name;
    private double duration;
    private double caloriesBurned;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( !name.isEmpty() && name.matches("[a-zA-Z ]+")){
            this.name = name;
        }
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if(duration > 0){
            this.duration = duration;
        }
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        if(caloriesBurned > 0 && caloriesBurned < 1000){
            this.caloriesBurned = caloriesBurned;
        }
    }

    public Workout(String name, double duration, double caloriesBurned) {
        setName(name);
        setDuration(duration);
        setCaloriesBurned(caloriesBurned);
    }
}
