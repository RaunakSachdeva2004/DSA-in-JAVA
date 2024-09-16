import java.util.Scanner;
public class bin_to_decimal{

public static void bintodec(int bin_num){
    int pow = 0;
    int dec = 0;
    int mynum = bin_num;
    while(bin_num > 0){

        int LD = bin_num % 10;
        dec = dec + (LD * (int)Math.pow(2, pow));       
        pow = pow +1;
        bin_num = bin_num / 10;
    }
    System.out.println("Decimal of " + mynum + " = " + dec);
}
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number in binary : ");
     int bin = sc.nextInt();
     bintodec(bin);
    sc.close();
    }
}