import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");// Prompt for the size of the array
        int n = input.nextInt();

        int[] list = new int[n];

        System.out.println("Lütfen sayıları giriniz (Çıkmak için -1): ");// Prompt for entering numbers (To exit, enter -1)
        for (int i = 0; i < n; i++) {
            System.out.print("Sayı " + (i + 1) + ": ");// Prompt for a number
            int num = input.nextInt();
            if (num == -1) {
                System.out.println("Programdan çıkılıyor.");// Exiting the program
                return; // Terminate the program
            }
            list[i] = num;
        }

        Arrays.sort(list);// Sorting the array

        System.out.print("Sıralı Sayılar: ");
        for (int sortedNumbers : list) {
            System.out.print(sortedNumbers + " ");
        }
    }
}