class Vivo {
    String model;
    int price ;
    
    Vivo(String model , int price ){
        this.model = model;
        this.price = price;
        System.out.println(model +" "+ price);
        
    }
}
public class Mobile {
    public static void main(String[] args) {
        Vivo model_1 = new Vivo("Vivo V30", 30000);
        Vivo model_2 = new Vivo("VIVO X70", 70000);
    }
}

