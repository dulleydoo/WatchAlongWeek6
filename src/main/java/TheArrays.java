import java.util.Arrays;

public class TheArrays {

//    Arrays -Arrays are building blocks to data structures that java has to offer -you can think
//    of an array as a bucket or lists of buckets where you define a fixed size -the index starts
//    at 0 -arrays are fast for data retrieval

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        // call your arraylisy
        System.out.println(Arrays.toString(colors));
        //acces a element
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
// change the value
        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));


        int[] numbers = {100, 200};
        System.out.println(colors.length);
        // looping through arrays
        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
        // reverse loop
        for(int i = colors.length - 1; i >=0 ; i--){
            System.out.println(colors[i]);
        }
        // enhanced for loop
        for(String color : colors){
            System.out.println(color);
        }
        //using stream
        Arrays.stream(colors).forEach(System.out::println);
    }
}
