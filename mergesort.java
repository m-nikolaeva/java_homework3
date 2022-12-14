import java.util.Arrays;
import java.util.Random;

/* Реализовать алгоритм сортировки слиянием */

public class mergesort {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(200);
        }
        System.out.printf("Исходный массив:\t%s\n", Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.printf("Отсортированный массив: %s\n", Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int firstIndex, int lastIndex) {
        if (lastIndex <= firstIndex)
            return;
        int mid = firstIndex + (lastIndex - firstIndex) / 2;
        mergeSort(arr, firstIndex, mid);
        mergeSort(arr, mid + 1, lastIndex);
        int[] temp = Arrays.copyOf(arr, arr.length);
        for (int k = firstIndex; k <= lastIndex; k++)
            temp[k] = arr[k];
        int i = firstIndex, j = mid + 1;
        for (int k = firstIndex; k <= lastIndex; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > lastIndex) {
                arr[k] = temp[i];
                i++;
            } else if (temp[j] < temp[i]) {
                arr[k] = temp[j];
                j++;
            } else {
                arr[k] = temp[i];
                i++;
            }
        }
    }
}