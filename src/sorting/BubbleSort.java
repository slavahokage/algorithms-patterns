package sorting;

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int k = 1;
        boolean swapping = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - k; j++) {
                if (array[j] > array[j + 1]) {
                    swapping = true;
                    int buffer = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buffer;
                }
            }
            k++;
            if (!swapping) {
                break;
            }
        }
        return array;
    }
}
