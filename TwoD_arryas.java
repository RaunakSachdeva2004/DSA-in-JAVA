public class TwoD_arryas {

    public static void main(String[] args) {
        String[][] cars =  new String[3][3];

        cars[0][0] = "suzuki";
        cars[0][1] = "camaro";
        cars[0][2] = "silvercar";
        cars[1][0] = "corvette";
        cars[1][1] = "mustang";
        cars[1][2] = "bmw";
        cars[2][0] = "ford";
        cars[2][1] = "ferrrari";
        cars[2][2] = "lambo";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            
        }

    }
    }
}
