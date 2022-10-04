import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
//    Queues FIFO stands for First in first out.
//    A collection designed for holding elements prior to processing like a printer
//    The elements or pages are queued and printed based on which was sent first, not most recent

        public static void main(String[] args) {
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

