public class set_ith_bit {
    public static  int setbit(int n , int i)
    {
        int bitmask = 1<<i;
        int newbit = n | bitmask;
    return newbit;
    }
    public static void main(String[] args) {
        System.out.println(setbit(10, 2));
    }
}
