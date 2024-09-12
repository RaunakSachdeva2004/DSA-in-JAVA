public class substring{
    public static String create_substr(String str, int si, int ei){
        String sub_str = "";
        for(int i = si ; i < ei;i++){
        sub_str += str.charAt(i);

        }
        return sub_str;
    }
    public static void main(String[] args) {
        String str = "hello world!";
        String result = create_substr(str, 0,5);
        System.out.println("The substring is: "+result);
    }
}