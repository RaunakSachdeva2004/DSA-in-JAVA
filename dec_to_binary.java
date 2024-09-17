import java.util.Scanner;
public class dec_to_binary {


    public static void dectobin(int dec)
    {
        int pow  = 0;
        int binnum = 0;     
        int mynum = dec;
        while(dec > 0){
            int rem = dec % 2;
            binnum = binnum + (rem * (int)Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        System.out.println("The binary of " + mynum + " is : " + binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in decimal : ");
        int decnum = sc.nextInt();
        dectobin(decnum);
        
        
        
        sc.close();
    }
}
