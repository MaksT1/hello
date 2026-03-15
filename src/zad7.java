import java.util.Scanner;

public class zad7 {
    public static void main(String[] args){
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj rozmiar n i m");
        int n = skan.nextInt();
        int m = skan.nextInt();
        double suma = 0;
        double[] a = new double[n];
        double[] b = new double[m];
        for(int i=0;i<n;i++){
            a[i] = Math.random();
        }
        for(int i=0;i<m;i++){
            b[i] = Math.random();
        }
        int rozmiar = Math.min(a.length, b.length);
        for(int i =0;i<rozmiar;i++){
            suma+=a[i]*b[i];
        }
        if(n!=m){
            System.out.println("Tablice sa rozne, mnozone zostalo" + rozmiar + "elementow: " + suma);
        }
        else{
            System.out.println("Wynik: " + suma);
        }
    }
}
