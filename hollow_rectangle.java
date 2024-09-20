import java.util.*;

public class hollow_rectangle {
    public static void hollowrectangle(int rows, int column){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1|| i == rows || j == 1 || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows and columns : " );
        int rows = sc.nextInt();
        int column = sc.nextInt();
        hollowrectangle(rows, column);

    }
    
}
