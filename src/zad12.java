import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad12 {
    public static double wiek(double w, String planet){
        Map<String, Double> planety = Map.of(
                "merkury", 0.2408467,
                "wenus", 0.61519726,
                "mars", 1.8808158,
                "jowisz", 11.862615,
                "saturn", 29.447498,
                "uran", 84.016846,
                "neptun", 164.79132
        );
        Double age = w/1000;

        return age*planety.get(planet);
    }
    public static void main(String[] args){
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj swoj wiek w sekundach");
        double wiek = skan.nextDouble();
        System.out.println("Teraz podaj planete na ktorej chcesz wiedziec swoj wiek");
        String planeta = skan.next();
        planeta = planeta.toLowerCase();
        double finals = wiek(wiek, planeta);
        System.out.print("Twoj wiek na planecie: " + planeta + " to: ");
        System.out.printf("%1.2f", finals);
    }
}
