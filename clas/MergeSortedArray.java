package clas;

public class MergeSortedArray {
    public static void merge(int[] arr, int[] arr2) {
        // Pointers for A, B, and the merged array
        int m=arr.length;
        int n=arr2.length;
        int indexA = m - 1;
        int indexB = n - 1;
        int indexMerged = m + n - 1;

        while (indexB >= 0) {
            if (indexA >= 0 && arr[indexA] > arr2[indexB]) {
                arr[indexMerged] = arr[indexA];
                indexA--;
            } else {
                arr[indexMerged] = arr2[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] A = {1, 3, 5, 7, 0, 0, 0}; // Array A with buffer space at the end
        int[] B = {2, 4, 6}; // Array B
        int m = 4; // Number of elements in A (not including the buffer)
        int n = 3; // Number of elements in B

        // Merge B into A
        merge(A, B);

        // Print the merged array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
