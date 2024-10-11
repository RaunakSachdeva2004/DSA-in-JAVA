import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        

        Scanner obj = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter ur name : ");
            name = obj.nextLine();
        }
        System.out.println("hello "+name);
        obj.close();

    }
    
    
}
