public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        long startTime = System.currentTimeMillis();
      
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(3000000) + 1);
        }
      
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo de llenado del vector: " + (double)elapsedTime / 60000 + " minutos");
        System.out.println("Los primeros 1000000 elementos del vector antes de ordenar:");
      
        for (int i = 0; i < 1000000; i++) {
            System.out.println(list.get(i));
        }
      
        int numeroBuscar = random.nextInt(100000) + 1;
        startTime = System.currentTimeMillis();
      
        if (list.contains(numeroBuscar)) {
            System.out.println("El número " + numeroBuscar + " fue encontrado en el vector.");
        } else {
            System.out.println("El número " + numeroBuscar + " no fue encontrado en el vector.");
        }
      
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Tiempo de búsqueda del número " + numeroBuscar + " antes de ordenar: " + (double) elapsedTime / 60000 + " minutos");
        Collections.sort(list);
        System.out.println("Los primeros 10 elementos del vector después de ordenar:");
      
        for (int i = 0; i <1000000; i++) {
            System.out.println(list.get(i));
        }
      
        long startTimeSort = System.currentTimeMillis();
        int index = Collections.binarySearch(list, numeroBuscar);
      
        if (index >= 0) {
            System.out.println("El número " + numeroBuscar + " fue encontrado en el vector ordenado.");
        } else {
            System.out.println("El número " + numeroBuscar + " no fue encontrado en el vector ordenado.");
        }
      
          endTime = System.currentTimeMillis();
          elapsedTime = endTime - startTimeSort;
          System.out.println("Tiempo de búsqueda del número " + numeroBuscar + " después de ordenar: " + (double) elapsedTime / 60000 + " minutos");
          long startTimeUnsorted = System.currentTimeMillis();
          index = Collections.binarySearch(list, numeroBuscar);
      
          if (index >= 0) {
              System.out.println("El número " + numeroBuscar + " fue encontrado en el vector desordenado.");
          } else {
              System.out.println("El número " + numeroBuscar + " no fue encontrado en el vector desordenado.");
          }
      
          endTime = System.currentTimeMillis();
          elapsedTime = endTime - startTimeUnsorted;
          System.out.println("Tiempo de búsqueda del número " + numeroBuscar + " en el vector desordenado: " + (double) elapsedTime / 60000 + " minutos");
      }
}
