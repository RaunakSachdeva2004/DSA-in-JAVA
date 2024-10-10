import java.util.Scanner;

public class user_input_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ebnter the values of a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        double sum = a + b;
        System.out.println(sum);
        sc.close();
    }
}
