import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {

        Scanner obj = new Scanner (System.in);
        
        int[] arr =  new int[5];
   /*     arr[0] = 23;
        arr[1] = 1;
        arr[2] = 232;
        arr[3] = 566;
        arr[4] = 56;
        System.out.println(arr[2]);//input manually

        System.out.println("Enetr 5 ");
        //input using for loop
        for(int i = 0;i < arr.length; i++)
        {

            arr[i] = obj.nextInt();
        }
        //printing array
        for(int i = 0;i < arr.length; i++)
        {

            System.out.print(arr[i] + " ");

    }
    System.out.println("Enetr five number for array");
    for(int i = 0;i < arr.length; i++)
    {

        arr[i] = obj.nextInt();
    }
  for ( int num : arr){ //for every elemetn in array, print the element
        System.out.print(num + " "); //here num represenst the elements of the array
    }
    //System.out.println(arr[6]);// index out of bounds error

    System.out.println(Arrays.toString(arr)); // prints as a STring like - [1, 2, 3, 4, 5]   */

//array of objects
    String[] str = new String[4];
    for(int i = 0; i < str.length; i++){
        str[i] = obj.next();

}
System.out.println(Arrays.toString(str));



}
}