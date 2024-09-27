import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr your number: ");
        
        int num = sc.nextInt();
        for(int i = 2;i <= (int)num/2; i++){
            if(num %i == 0){
                System.out.println("the number " + num + " is not prime.");
                break;
            }
            else{
                 System.out.println("the number " + num + " is prime.");
        }
        } 
        sc.close();
    
    
    }
}
