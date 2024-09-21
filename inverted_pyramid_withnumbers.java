public class inverted_pyramid_withnumbers { 

    public static void numberpyramid(int n){
    
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n + 1 -i; j++)
            {
            System.out.print(j + " ");
            
            }   
        System.out.println();
     }
    }
public static void main(String[] args) {
    numberpyramid(5);
}}
