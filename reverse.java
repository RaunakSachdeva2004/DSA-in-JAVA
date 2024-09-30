public class reverse {
    public static void main(String[] args) {
        
        //int n = 17112004;
        int last;
        for (int n = 17112004; n > 0; n = (int) n /10){
             last = n % 10;
             System.out.print (last);
     }
        
    }
}
