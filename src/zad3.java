import java.io.Console;
import java.util.Scanner;

public class zad3 {
    public static void main (String[] args){
        Scanner skaner = new Scanner(System.in);
        System.out.println("podaj zdanie");
        String a1 = skaner.next();
        String a2 = skaner.next();
        System.out.println("%" + a2 + " " + a1 + "%");
        skaner.close();
    }
}
