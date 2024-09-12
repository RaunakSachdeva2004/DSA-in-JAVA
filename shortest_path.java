public  class shortest_path{
    public static double path_shortest(String path){
        int x = 0;
        int y = 0;
        int n = path.length();
        for(int i = 0; i < n; i++){
            char dir = path.charAt(i);
            if(path.charAt(i)=='N'){
              x++;  
            }     
            else if (dir == 'S') {
                x--;
            }
            else if (dir == 'E') {
                y--;
            }
            else if (dir == 'W') {
                y--;
            }
            else{System.err.println("Invalid input.");}
                
            }
            int x2 = x*x;
            int y2 = y*y;
            return Math.sqrt(x2+y2);
        }
 
    public static void main(String args[]) {
        String path = "WNEENESE";
        System.out.println("Shirtest path is: " + path_shortest(path));
        
    }
}