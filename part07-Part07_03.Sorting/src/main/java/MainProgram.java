
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] arr){
        int smallest = smallest(arr);
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
        int smallest = arr[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
            swap(arr, i, indexOfSmallestFrom(arr, i));
            System.out.println(Arrays.toString(arr));
        }
    }
}
