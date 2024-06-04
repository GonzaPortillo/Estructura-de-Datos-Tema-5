public class MergeSort {
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            // Ordenar primera y segunda mitad
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            // Fusionar las mitades ordenadas
            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        // Encuentre tamaños de dos subarreglos para fusionar
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Crear arreglos temporales
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copiar datos a arreglos temporales
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Fusionar las arreglos temporales
        // Índices iniciales del primer y segundo subarreglo.
        int i = 0, j = 0;

        // Índice inicial del arreglo de subarreglos fusionados
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copie los elementos restantes de leftArray[] si los hay
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copie los elementos restantes de rightArray[] si los hay
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {50, 30, 60, 40, 20, 70, 100, 80, 90, 10};
        System.out.println("Elementos desordenados:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        long startTime = System.nanoTime();
        mergeSort(array, 0, array.length - 1);
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
