import java.util.HashSet;
import java.util.Set;

public class zad11 {
    public static boolean czyp(String tekst){
        tekst = tekst.toLowerCase();
        Set<Character> found = new HashSet<>();
        for(int i = 0;i<tekst.length();i++){
            char ch = tekst.charAt(i);
            if(ch >= 'a' && ch <='z'){
                found.add(ch);
            }
        }

        return found.size() == 26;
    }
    public static void main(String[] args){
        String t = "The quick brown fox jumps over the lazy dog";
        String t2 = "Siema to jest false na pewno";
        System.out.println(czyp(t));
        System.out.println(czyp(t2));
    }
}
