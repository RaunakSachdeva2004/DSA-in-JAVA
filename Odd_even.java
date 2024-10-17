public class Odd_even{
    public static String oddoreven(int number){
        int bitmask = 1;
        if((number & bitmask) == 1){
            return "Odd";
        }
        else{
            return "even";
        }
    }
    public static void main(String[] args) {
        int number = 10;
        System.out.println(oddoreven(number));
    }
}