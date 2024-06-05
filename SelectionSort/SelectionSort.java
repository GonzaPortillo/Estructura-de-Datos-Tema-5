public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Recorre todo el array
        for (int i = 0; i < n - 1; i++) {
            // Encuentra el elemento mínimo en el array sin ordenar
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Intercambia el elemento mínimo con el primer elemento
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Array original:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Array ordenado:");
        printArray(arr);
    }

    // Método para imprimir el array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
