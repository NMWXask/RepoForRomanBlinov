import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Роман!");
        System.out.println("Работа с массивом для Git тренировки");
        System.out.println("====================================");
        Random random=new Random();
        int n= random.nextInt(1,10);
        int []mass=new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i]= random.nextInt(1,5);
        }
        //Выводим массив
        System.out.println(Arrays.toString(mass));
        //Находим максимальный элемент массива
        int maxEl=0;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]>maxEl){
                maxEl=mass[i];
            }
        }
        System.out.println(maxEl);
        sredArifm(mass);
        checkEl(mass);
    }
    //Метод для нахождения среднего арифметического элементов массива
    public static void sredArifm(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum/ arr.length);
    }
    //Метод,который осуществляет проверку,на наличие заданного числа (от 1 до 5)среди элементов массива.
    public static void checkEl(int[]arr){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число для проверки от 1 до 5:");
        int number= scanner.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                count++;
            }
        }
        System.out.printf("Число %d в массиве встречается %d раз",number,count);
    }
}