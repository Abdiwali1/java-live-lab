package week9.evening;

public class TestWorkout {
    public static void main(String[] args) {
        Workout bench = new Workout("Bench Press", 30, 100);
        System.out.println(bench);

        Workout curls = new Workout("5Curls", -5, 100);
        System.out.println(curls);

    }
}
