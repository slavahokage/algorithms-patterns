package utils;

public final class Printer {
    private Printer() {
    }

    public static void print(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }
}
