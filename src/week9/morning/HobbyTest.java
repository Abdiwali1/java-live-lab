package week9.morning;

import java.awt.event.*;
import java.util.*;

public class HobbyTest {

    public static void main(String[] args) {
        Hobby reading = new Hobby("Reading", 400, false, false);
        Hobby football = new Hobby("Football", 100, true, true);
        Hobby racing = new Hobby("Racing", 10000, true, false);

        ArrayList<Hobby> hobbies = new ArrayList<>(Arrays.asList(reading, football, racing));

        //System.out.println(hobbies);

        for (Hobby hobby : hobbies) {
            hobby.doIt();
        }

        ArrayList<Hobby> indoor = new ArrayList<>(hobbies);
        indoor.removeIf(p->p.isOutDoor==true);
        System.out.println(indoor);

        ArrayList<Hobby> playAlone = new ArrayList<>(hobbies);
        playAlone.removeIf(p -> p.requireOthers == true);
        System.out.println(playAlone);

        ArrayList<Hobby> expensive = new ArrayList<>(hobbies);
        expensive.removeIf(p -> p.annualCost > 500);
        System.out.println(expensive);


    }
}
