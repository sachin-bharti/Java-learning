import java.util.*;
public class Factoreal{
    public static int factoreal(int number){
       if(number == 0 ){
        return 1;
       } 
       return number * factoreal(number - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        int result=factoreal(number);
        System.out.println("foactoreal of "+ number +"is :" + result);
        sc.close();

    }
}