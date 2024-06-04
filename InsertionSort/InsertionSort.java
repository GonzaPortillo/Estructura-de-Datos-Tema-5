public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            // Mover elementos del arreglo[0..i-1] que sean mayores que la clave
            // a una posición por delante de su posición actual
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {57, 33, 18, 74, 2, 7, 11, 100};
        System.out.println("Elementos desordenados:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        long startTime = System.nanoTime();
        insertionSort(array);
        long endTime = System.nanoTime();
        
        long duration = endTime - startTime;
        System.out.println("Elementos ordenados:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Tiempo de ejecución en nanosegundos: " + duration);
    }
}
