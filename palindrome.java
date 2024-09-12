public class palindrome {
    public static void check_palindrome(String word){
        String rev = "";
        int n = word.length();
        for(int i = 0; i < n; i++){
            rev += word.charAt(n-1-i);
        }
        if(rev.equals(word)){
                     System.out.println(word + " is a palindrome.");
        }
                 else{
    System.out.println(word+" is not a palindrome.");}
    System.out.println(rev);
}
    
    
    public static void main(String args[]){
        String word = "racecar";
        check_palindrome(word);
    }    
}
