import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int rows; int column;
        String symbol ="";

        System.out.println("Enter the number of rows");
        rows = obj.nextInt();

        
        System.out.println("Enter the number of column");
        column = obj.nextInt();

        
        System.out.println("Enter the symbol");
        symbol = obj.next();

        for(int i =0;i<=rows;i++){
            
            System.out.println();
            for(int j=0;j<=column;j++){
                System.out.print(symbol);

            }
        }obj.close();
    }
}
