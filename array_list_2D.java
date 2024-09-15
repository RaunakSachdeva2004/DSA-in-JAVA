import java.util.ArrayList;

public class array_list_2D {
    public static void main(String[] args) {
        //2d array list = a dynamic list of lists
        //we can change the size of theese lists during runtime


        ArrayList<ArrayList<String>> grocery_list = new ArrayList<>();
 
        ArrayList<String>  bakery_list = new ArrayList<>();
        bakery_list.add("pasta");
        bakery_list.add("bread");
        bakery_list.add("donuts");

        ArrayList<String>  vegetable_List = new ArrayList<>();
        bakery_list.add("brocolli");
        bakery_list.add("onion");
        bakery_list.add("cucumber");

        ArrayList<String>  drinks_list = new ArrayList<>();
        bakery_list.add("cold drinnk");
        bakery_list.add("coffee");

        grocery_list.add(bakery_list);
        grocery_list.add(vegetable_List);
        grocery_list.add(drinks_list);

       


        System.out.println(grocery_list + " ");

        



    }
}
