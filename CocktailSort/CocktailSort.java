public class CocktailSort {
      public static void cocktailSort(int[] array) {
          boolean swapped = true;
          int start = 0;
          int end = array.length - 1;
        
          while (swapped) {
              swapped = false;
              // Método de burbuja en dirección hacia adelante
              for (int i = start; i < end; i++) {
                  if (array[i] > array[i + 1]) {
                      int temp = array[i];
                      array[i] = array[i + 1];
                      array[i + 1] = temp;
                      swapped = true;
                  }
              }
            
              // Si no se intercambiaron elementos, la matriz está ordenada
              if (!swapped) {
                  break;
              }  
            
              // De lo contrario, restablezca la bandera intercambiada para que pueda usarse en la siguiente etapa.
              swapped = false;
              // Mover el punto final hacia atrás uno
              end--;
              // Método de burbuja en dirección hacia atrás
            
              for (int i = end; i > start; i--) {
                  if (array[i] < array[i - 1]) {
                      int temp = array[i];
                        rray[i] = array[i - 1];
                      array[i - 1] = temp;
                      swapped = true;
                  }
              }
              // Mover el punto inicial hacia adelante uno
              start++;
          }
      }
  
      public static void main(String[] args) {
          int[] array = {5, 3, 8, 4, 2, 7, 1, 10};
          System.out.println("Elementos desordenados:");
        
              for (int i : array) {
                  System.out.print(i + " ");
              }
        
          System.out.println();
          long startTime = System.nanoTime();
          cocktailSort(array);
          long endTime = System.nanoTime();
          long duration = endTime - startTime;
        
          System.out.println("Elementos ordenados:");
        
          for (int i : array) {
              System.out.print(i + " ");
          }
          System.out.println("-------------------------------------------------------");
          System.out.println("Tiempo de ejecución en nanosegundos: " + duration);
    }
}
