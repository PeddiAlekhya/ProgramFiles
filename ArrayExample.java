import java.util.Scanner;

public class ArrayCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("printing array :");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}