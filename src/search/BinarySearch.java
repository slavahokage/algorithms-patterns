package search;

public class BinarySearch implements Searchanble {

    @Override
    public int search(int[] sortArray, int elem) {
        int left = 0;
        int right = sortArray.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (sortArray[middle] < elem) {
                left = middle + 1;
            } else if (sortArray[middle] > elem) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
