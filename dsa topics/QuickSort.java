import java.util.*;

public class QuickSort {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(int[] a, int st, int end) {
        int pivot = a[st];
        int count = 0;

        for (int i = st + 1; i <= end; i++) {
            if (a[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = st + count;
        swap(a, st, pivotIndex);
        int i = st;
        int j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (i < pivotIndex && a[i] <= pivot) {
                i++;
            }
            while (j > pivotIndex && a[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(a, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public static void quickSort(int[] a, int st, int end) {
        if (st >= end)
            return;
        int pivotIndex = partition(a, st, end);
        quickSort(a, st, pivotIndex - 1);
        quickSort(a, pivotIndex + 1, end);
    }

    public static void main(String[] args) {
        int a[] = { 3, 4, 5, 1, 2, 2, 3, 7, 8, 3, 2, 1, 97 };
        int n = a.length;
        System.out.println("Array before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        quickSort(a, 0, n - 1);
        System.out.println("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
