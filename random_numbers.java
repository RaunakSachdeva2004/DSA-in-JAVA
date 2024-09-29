import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {
        
        Random obj = new Random();

        //int x= obj.nextInt(6);
        double y = obj.nextDouble();

        System.out.println(y);
        
        //System.out.println(x);
        boolean z = obj.nextBoolean();
        System.out.println(z);





    }
}
