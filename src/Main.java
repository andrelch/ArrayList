import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //creates an Array
        String[] flavours = {"Vanilla", "Chocolate", "Strawberry", "Green Tea"};
        System.out.println("My favourite ice cream flavour is " + flavours[3]);

        //converts Array to ArrayList
        //List <String> newFlavours = Arrays.asList(flavours);
        ArrayList <String> newFlavours = new ArrayList(Arrays.asList(flavours));
        //prints elements of the chosen indexes from the ArrayList with
        System.out.println("My favourite milkshake flavours are " + newFlavours.get(0) + " and " + newFlavours.get(1) + "\n");

        //adds banana to the newFlavours ArrayList
        newFlavours.add(4, "Banana");
        //prints elements within ArrayList
        System.out.println(newFlavours);
        //prints size of ArrayList
        System.out.println("The list above has " + newFlavours.size() + " items");


        /*ArrayList<String> newerFlavours = new ArrayList<String>(5);
        newerFlavours.add(0,"a");
        System.out.println(newerFlavours);*/

    }
}