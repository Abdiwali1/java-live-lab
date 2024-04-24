package week9.morning;

public class WorkoutTest {

    public static void main(String[] args) {
        Workout running = new Workout("Running",30,250);
        System.out.println("running.getName() = " + running.getName());
        System.out.println("running.getDuration() = " + running.getDuration());
        System.out.println("running.getCaloriesBurned() = " + running.getCaloriesBurned());

        Workout lifting = new Workout("Lifting!",-4,1500);
        System.out.println("lifting.getName() = " + lifting.getName());
        System.out.println("lifting.getDuration() = " + lifting.getDuration());
        System.out.println("lifting.getCaloriesBurned() = " + lifting.getCaloriesBurned());

    }
}
