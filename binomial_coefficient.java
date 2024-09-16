import java.util.Scanner;

public class binomial_coefficient {
    
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1 ;i <= n; i++){
            fact = fact * i;    
        }
        return fact;
       }
    public static double bionomial(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        double bio = a/(b*c);
        return bio;
    }
    
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the numbers : ");
    int n = sc.nextInt();
    int r = sc.nextInt();
    System.out.println("the bionomail coeffiecient is : " + bionomial(n, r));
    sc.close();
    }
}
