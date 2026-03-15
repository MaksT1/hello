import java.util.Scanner;

public class zad8 {
    public static void main(String[] args){
        Scanner skan = new Scanner(System.in);
        int n = 0;
        while (true) {
            if (skan.hasNextInt()) {
                n = skan.nextInt();
                if (n > 0) break;
            } else {
                skan.next();
            }
        }


        for (int i = 0; i < n - 1; i++) {
            System.out.println();
            System.out.println("**");
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            System.out.println("**");
            System.out.println();
            System.out.println();
        }
    }
}
