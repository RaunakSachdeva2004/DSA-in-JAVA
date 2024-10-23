public class diagonal_Sum {
    public static int diagonal(int max[][]){
        int sum = 0;
        // for(int i = 0; i < max.length; i++){ O(n^2)
    //         for(int j = 0; j < max[0].length; j++){
    //             if(i == j){
    //                 sum += max[i][j];
    //             }
    //         else if(i+j == max.length-1){
    //             sum += max[i][j];
    //         }
    //         }
    //     }
    //     return sum;
    // }

     for(int i = 0; i < max.length; i++){    //  O(n)
        //pd
        sum += max[i][i];

        //sd  
         if(i != max.length-1-i){
        sum += max[i][max.length-1-i];
        }
    }
    return sum;
}
    public static void main(String args[]){
        // int max[][] = {{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};
        int max[][] = {{1,2,3},{4,5,6},{7,8,9}};
                int sum =diagonal(max);
                System.out.println("the sum is:" + sum);
            }
}
