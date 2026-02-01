public  class function {
    static void MyMathod(){
           System.out.println("what's up bro :");

    }
    static  int addition(int x ,int y){
        return  x + y;


    }
    // recusion function
    public static int factoreal(int x){
        if (x == 0){
            return  1;

        }
        return x * factoreal(x - 1);

    }
    public static void main(String[] args) {
        System.out.println("hey Sachin ");
        MyMathod();
        MyMathod();
        System.out.println(addition(23, 34));
        int z = addition(50, 50);
        System.out.println(z);
        System.out.println(factoreal(10));

    }
}