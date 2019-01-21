package sorting;

public class SelectionSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int positionOfMinElement = index;
            for (int j = index; j < array.length; j++) {
                if (array[j] < array[positionOfMinElement]) {
                    positionOfMinElement = j;
                }
            }
            int buffer = array[index];
            array[index] = array[positionOfMinElement];
            array[positionOfMinElement] = buffer;
            index++;
        }
        return array;
    }
}
