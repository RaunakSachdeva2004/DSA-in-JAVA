import java.util.Scanner;
public class hypotunese {
    public static void main(String[] args) {

        
        
        double x ;
        double y ;
        double z ;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the values of x and y.");
        
        x = obj.nextDouble();
        y = obj.nextDouble();
        
        z = Math.sqrt((x*x)+(y*y));

        System.out.println("the hypotunese is : "+z);
        obj.close();
        
    }
}
