// public class clear_iyh_bit {
//     public static int clearbit(int value, int i ) {
//         int bitmask = 1<<i;
//         return (value ^ bitmask);
// }
// public static void main(String[] args) {
//     System.out.println(clearbit(10,1));
// }}
// Java Program to Reverse a Word

import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main (String[] args) {
      
        String str= "Geeks", nstr="";
        char ch;
      
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
