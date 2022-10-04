import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
        public static void main(String[] args) {
            //FIFO First in first out
            Queue<String> superMarket = new LinkedList<>();

            superMarket.add("Coke");
            superMarket.add("Chips");
            superMarket.add("Chocalate");

            System.out.println(superMarket.peek());
            System.out.println(superMarket.size());
            System.out.println(superMarket);

            System.out.println(superMarket.add("Water"));
            System.out.println(superMarket);

            System.out.println(superMarket.peek());

        }




}

