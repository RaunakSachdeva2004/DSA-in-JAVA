public class palindrome_each{
    public static boolean check_palindorme(String word){
        int n = word.length();
        for(int i =0; i<n/2; i++){
            if(word.charAt(i ) == word.charAt(n-i-1)){
                return true;
            }
            else{return false;}

        }
        return false;
    }
    public static void main(String[] args) {
        String word = "RACECAR";
        boolean result = check_palindorme(word);
        if(result==true){
            System.out.println("The word is plaindrome.");
        }
        else{System.out.println("the word in not palindrome.");}
    }
}