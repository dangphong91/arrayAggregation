import java.util.Scanner;

public class Array {
    public static int[] creatArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i< size; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
    public static void printArr(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static int[] arrayAggregation(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int j = arr1.length; j < arr.length; j++) {
            arr[j] = arr2[j - arr1.length];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = creatArr();
        printArr(arr1);
        System.out.println();
        int[] arr2 = creatArr();
        printArr(arr2);
        System.out.println();
        int[] arr = arrayAggregation(arr1, arr2);
        printArr(arr);
    }
}
