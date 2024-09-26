public class OOPS {
    public static void main(String[] args) {
        
        car mycar = new car();      // mycar is the object

        System.out.println(mycar.model);
        System.out.println(mycar.make);
        System.out.println(mycar.price);
        System.out.println(mycar.year);

        mycar.drive();
        mycar.brake();


    }
}