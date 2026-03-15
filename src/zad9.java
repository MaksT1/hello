import java.util.Scanner;

public class zad9 {
    public static void main(String[] args){
        char[] slowo = new char[100];
        Scanner skan = new Scanner(System.in);
        Boolean palindrom = true;
        String napis = "";
        while(skan.hasNext()){
            napis = skan.next();
            napis.getChars(0, napis.length(), slowo, 0);
            break;
        }
        for(int i=0;i<napis.length() - 1;i++){
            if(slowo[i] != slowo[napis.length() - 1 - i]){
                palindrom = false;
                break;
            }
        }
        if(palindrom){
            System.out.println("TAK");
        }
        else{
            System.out.println("NIE");
        }
    }
}
