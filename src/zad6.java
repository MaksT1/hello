import java.util.Scanner;

public class zad6 {
    public static void  main(String[] args){
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj a b c");
        double a = skan.nextDouble();
        double b = skan.nextDouble();
        double c = skan.nextDouble();
        if(a > b && a>c){
            if(b>c){
                System.out.println(c + " " + b + " " + a + " " + a + " " + b + " " + c);
            }
            else{
                System.out.println(b + " " + c + " " + a + " " + a + " " + c + " " + b);
            }
        }
        else if(b> a && b>c){
            if(a>c){
                System.out.println(c + " " + a + " " + b + " " + b + " " + a + " " + c);
            }
            else{
                System.out.println(a + " " + c + " " + b + " " + b + " " + c + " " + a);
            }
        }
        else if(c > b && c>a){
            if(b>a){
                System.out.println(a + " " + b + " " + c + " " + c + " " + b + " " + a);
            }
            else{
                System.out.println(b + " " + a + " " + c + " " + c + " " + a + " " + b);
            }
        }
    }
}
