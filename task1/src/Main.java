import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество элементов ");
        int n = scanner.nextInt();
        System.out.print("Интервал ");
        int m = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        int k = 0;
        System.out.print("Полученный путь - ");
        do {
            System.out.print(array[k]);
            k = (k + m - 1) % n;
        } while (k != 0);
    }
}