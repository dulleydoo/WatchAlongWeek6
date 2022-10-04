import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static java.awt.Color.red;

public class WorkingWithSets {
    public static void main(String[] args) {

        //sets contain no duplicates
        //we don't know what is inside the set, no order is guaranteed
        //sets contain no pair of elements that equal each other
        //one null
            Set<String> balls = new HashSet<>();

            balls.add("Yellow Ball");
            balls.add("Blue Ball");
            balls.add("Green Ball");
            balls.add("Purple Ball");
            balls.add("Red Ball");
            balls.add("Red Ball"); //Sets don't repeat-this won't print out
            System.out.println(balls.size());
            System.out.println(balls);

    }
}
