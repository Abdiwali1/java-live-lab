package week9.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHobby {

    public static void main(String[] args) {

        Hobby golf = new Hobby("Golf", 1000, true, false);

        ArrayList<Hobby> hobbies = new ArrayList<>(Arrays.asList(
                golf,
                new Hobby("Tennis", 300, true, true),
                new Hobby("Puzzles", 100, false, false),
                new Hobby("Cooking", 800, false, false),
                new Hobby("Coding", 0, false, false),
                new Hobby("Hiking", 200, true, false),
                new Hobby("Running", 200, true, false)
        ));

        for(Hobby eachHobby : hobbies){
            eachHobby.doIt();
        }

        System.out.println("================ Original ================");
        hobbies.forEach(System.out::println);

        System.out.println("================ indoor hobbies ================");
        ArrayList<Hobby> indoorHobbies = new ArrayList<>(hobbies);
        indoorHobbies.removeIf(p -> p.isOutdoors());
        indoorHobbies.forEach(System.out::println);

        System.out.println("================ hobbies by myself ================");
        ArrayList<Hobby> soloHobbies = new ArrayList<>(hobbies);
        soloHobbies.removeIf(p -> p.isRequiresOthers());
        soloHobbies.forEach(System.out::println);

        System.out.println("================ costs less than 300 ================");
        ArrayList<Hobby> budgetHobbies = new ArrayList<>(hobbies);
        budgetHobbies.removeIf(p -> p.getAnnualCost() >= 300);
        budgetHobbies.forEach(System.out::println);

    }
}
/*
 Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */
