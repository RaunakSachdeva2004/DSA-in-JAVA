import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("What is ur name shawtyy??");
        String name = obj.nextLine();
        
        System.out.println("how old are u?");
        int age = obj.nextInt();

        System.out.println("What is ur fav food?");
        String food = obj.nextLine();

        System.out.println("Hello " +name);
        System.out.println("You are "+age + " years old.");
        System.out.println("your fav food is = "+food);

        obj.close();
    }
}
