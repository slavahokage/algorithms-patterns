package search;

public class Main {
    public static void main (String args[]){
       Searchanble binarySearch = new BinarySearch();
       int[] array = new int[]{1,2,3,4,5};
        System.out.println(binarySearch.search(array,5));
    }
}
