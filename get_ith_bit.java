public class get_ith_bit {
   public static int getbit(int value, int i ) {
    int bitmask = 1<<i;
    if((value & bitmask) == 0){
        return 0;
    }
    else{
        return 1;
    }
}
    public static void main(String[] args) {
        System.out.println(getbit(10, 3));
    }
    
}  
