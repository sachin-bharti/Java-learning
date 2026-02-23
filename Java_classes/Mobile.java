package Java_classes;
public class Mobile {
    String MBrand;
    int price ;
    void firstPhone() {
        System.out.println("this my first phone :");
        System.out.println("Mobile name :" + MBrand);
        System.out.println("Price :" + price);
    }
     void secondphone() {
        System.out.println("this my second phone :");
        System.out.println("Mobile name :" + MBrand);
        System.out.println("Price :" + price);
    }
    public static void main(String[] args) {
       Mobile m1 = new Mobile(); 
       m1.MBrand = " VIVO";
       m1.price = 15000;
       m1.firstPhone();
       Mobile m2 = new Mobile();
       m2.MBrand = "Iqoo Z7";
       m2.price = 25000;
       m2.secondphone();


       
       
    }

}
