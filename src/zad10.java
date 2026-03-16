    import java.util.Scanner;

    public class zad10 {
        public static void main(String[] args){
            Scanner skan = new Scanner(System.in);
            int[][] tab = new int[100][100];

            try{
                if(!skan.hasNextInt()){
                    throw new Exception();
                }
                int a = skan.nextInt();

                if(!skan.hasNextInt()){
                    throw new Exception();
                }
                int b = skan.nextInt();

                if(a <= 0 || b<=0 || a>100 || b>100){
                    throw new Exception();
                }

                for(int i = 0; i<a;i++){
                    for(int j=0;j<b;j++){
                        if(!skan.hasNextInt()) throw new Exception();
                        tab[i][j] = skan.nextInt();
                    }
                }
                for(int i = 0; i<b;i++){
                    for(int j=0;j<a;j++){
                        System.out.print(tab[j][i] + " ");
                    }
                    System.out.println();
                }


            }catch(Exception e){
                System.out.println("BŁĄD");
            }
        }
    }
