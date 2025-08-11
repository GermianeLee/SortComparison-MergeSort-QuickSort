import java.util.Random;

public class SortComparison {
    public static void main(String[] args) {
        int[] sizes = {10, 50, 100};
        Random rand = new Random();

        for (int size : sizes) {
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            for (int i = 0; i < size; i++) {
                arr1[i] = arr2[i] = rand.nextInt(1000);
            }

            MergeSort mergeSort = new MergeSort();
            QuickSort quickSort = new QuickSort();

            long startTime = System.nanoTime();
            mergeSort.mergeSort(arr1);
            long mergeTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            quickSort.quickSort(arr2, 0, arr2.length - 1);
            long quickTime = System.nanoTime() - startTime;

            System.out.println("Size: " + size);
            System.out.println("Merge Sort Time: " + mergeTime + " ns");
            System.out.println("Quick Sort Time: " + quickTime + " ns");
        }
    }
}
