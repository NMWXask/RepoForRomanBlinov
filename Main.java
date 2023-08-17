import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int n= random.nextInt(1,10);
        int []mass=new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i]= random.nextInt(1,5);
        }

        System.out.println(Arrays.toString(mass));
        int maxEl=0;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]>maxEl){
                maxEl=mass[i];
            }
        }
        System.out.println(maxEl);
    }
}