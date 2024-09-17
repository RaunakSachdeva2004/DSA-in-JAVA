import java.util.*;
 class factoril {

  public static int factorial(int n){
    int fact = 1;
    for (int i = 1 ;i <= n; i++){
        fact = fact * i;    
    }
    return fact;
   }
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number u want the factorial of : ");
    int num = sc.nextInt();
    System.out.println("the factorial of " + num + " is " + factorial(num));
    sc.close();
}
}
