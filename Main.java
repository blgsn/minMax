

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        
        Scanner input = new Scanner(System.in);      
        System.out.println("Eleman sayısını giriniz:");
        int number = input.nextInt();                
     
        int min = list[0];
        int max = list[0];
        Arrays.sort(list);

        for (int i : list) {
            if (i < number) {
            	min=i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }

        System.out.println("en küçük en yakın değer " + min);
        System.out.println("en büyük en yakın değer " + max);

    }
}



