package shell.sort;

public class ShellSort {
    public static void shellSort(int[] array) {
        int n = array.length;
        // Comienza con un gran intervalo, luego reduce el intervalo
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Realiza una ordenación por inserción con este tamaño de intervalo.
            // Los primeros elementos del intervalo array[0..gap-1] ya están ordenados por el intervalo
            // sigue agregando un elemento más hasta que todo el array esté ordenado por intervalos
            for (int i = gap; i < n; i++) {
                // agrega array[i] a los elementos que han sido ordenados por intervalos
                // guarda array[i] en temp y haz un agujero en la posición i
                int temp = array[i];
                // desplaza los elementos ordenados por intervalos anteriores hacia arriba hasta que se encuentre la ubicación correcta para array[i]
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                // coloca temp (el array[i] original) en su ubicación correcta
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {500, 323, 854, 444, 2, 7, 1, 10};
        System.out.println("Elementos desordenados:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        long startTime = System.nanoTime();
        shellSort(array);
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

