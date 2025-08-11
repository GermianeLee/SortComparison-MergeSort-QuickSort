public class MergeSort {
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int mid = arr.length / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[arr.length - mid];

        // Divide array into two halves
        for (int i = 0; i < mid; i++) leftHalf[i] = arr[i];
        for (int i = mid; i < arr.length; i++) rightHalf[i - mid] = arr[i];

        // Recursively sort each half
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge sorted halves
        merge(arr, leftHalf, rightHalf);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
}
