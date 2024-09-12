public class comparison{
    public static void main(String args[]){
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
        if(s1 == s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
    }

    if(s1==s3){
        System.err.println("EQUAl");
    }
    else{System.out.println("NOT EQUAL");}
    if(s1.equals(s3)){
        System.err.println("Equal");
    }
    else{System.out.println("not equal");}
    }
}