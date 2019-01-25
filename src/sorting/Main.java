package sorting;

import Utils.Printer;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 4, 4, 8, 5, 6, 7, 8, 10};
        int[] array2 = new int[]{1, 2, 4,5, 5, 6, 7, 8, 1};
        int[] array3 = new int[]{1, 2, 4, 8, 5, 6, 7, 8, 6};

        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();

        Printer.print(selectionSort.sort(array1));
        Printer.print(bubbleSort.sort(array2));
        Printer.print(insertionSort.sort(array3));
    }
}
