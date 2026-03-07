import java.util.Scanner;

public class zad4 {
    public static void main (String[] args){
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj boki");
        int a = skan.nextInt();
        int b = skan.nextInt();
        int c = skan.nextInt();
        if(a <=0 || b <= 0 || c<=0) System.out.println("BŁĄD!");
        else{
            if(a+b>c && a+c>b && b+c>a){
                System.out.println("Tak");
            }
            else{
                System.out.println("Nie");
            }
        }

    }
}
