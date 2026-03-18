public class zad13 {
    public static int max(int[] tab, int index){

       if(index == tab.length - 1){
           return tab[index];
       }
       int maximum = max(tab, index + 1);

       if(tab[index] > maximum){
           return tab[index];
       }
       else{
           return maximum;
       }

    }
    public static void main(String[] args){
        int[] tab = {1, 2, 3, 6, 2,3, 6, 8, 9, 18, 2 ,34, 56};
        System.out.println(max(tab, 0));
    }
}
