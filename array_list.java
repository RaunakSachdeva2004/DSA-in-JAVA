import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();

        food.add("apple");
        food.add("pizza");
        food.add("banana");

        food.set(1,"burger");
        food.remove(2);
        food.clear();   


        for (int i = 0; i < food.size(); i++) {
            System.out.print(food.get(i)+ " ");
        }








    }
}
