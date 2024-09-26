public class overloading {
    public static void main(String[] args) {
        //overloaded methods = same name but different parameters

        System.out.println(add(5, 5));
        System.out.println(add(5, 5, 5));
        System.out.println(add(5, 5, 5, 5));

    }
    static int add(int a, int b){
        System.out.println("overloaded 1");return a+ b;

    }
    static int add(int a, int b, int c){
       System.out.println("overloaded 2"); return a+ b + c;

    }
    static int add(int a, int b, int c,int d){
        System.err.println("overloaded 3");return a+ b + c + d;

    }

}
