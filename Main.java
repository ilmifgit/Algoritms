public class Main{
    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        int[] arr = {9, 5, 2, 7, 1, 8, 3};

        merge.mergeSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}