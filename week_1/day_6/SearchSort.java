import java.util.Arrays;

public class SearchSort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        // sort
        Arrays.sort(arr);

        System.out.println("Sorted:");
        for (int n : arr) {
            System.out.println(n);
        }

        // binary search (must be sorted)
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index);
    }
}