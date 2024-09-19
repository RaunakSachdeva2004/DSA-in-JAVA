import java.util.ArrayList;

public class for_each_loop {
    
    public static void main(String[] args) {


        //String[] animals = {"cat", "dog", "lion", "tiger"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("lion");
        animals.add("tiger");


        for(String i : animals){
            System.out.print(i + " ");
        }



    }
}
