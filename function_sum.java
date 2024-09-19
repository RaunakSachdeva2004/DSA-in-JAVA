import java.util.*;
public class function_sum {
    public static int sum(int num1, int num2){  //formal parametersṇ
        return (num1 + num2) ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is : "+ sum(a,b)); //arguments or actual parameters
        sc.close();
        
    }
}
