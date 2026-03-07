import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner myobj = new Scanner(System.in);

        System.out.println("Podaj a: ");
        int a = myobj.nextInt();
        System.out.println("Podaj b: ");
        int b = myobj.nextInt();
        System.out.println(a*b);
    }
}
