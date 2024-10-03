public class swapping_variables {
    public static void main(String[] args) {
        String x = "water";
        String y = "kool aid";
        
        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x is = "+x);
        System.out.println("y is = "+y);


    }
}