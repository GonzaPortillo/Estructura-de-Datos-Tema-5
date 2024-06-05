# _*Metodos de ordenamiento*_

## Índice
1. [Introducción](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/blob/main/README.md#introducción)
2. [BubbleSort](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/blob/main/README.md#método-de-ordenamiento-de-la-burbuja-bubblesort)
3. [SelectionSort](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/edit/main/README.md#método-de-ordenamiento-de-selección-selectionsort)
4. [InsertionSort](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/edit/main/README.md#método-de-ordenamiento-de-inserción-insertionsort)
5. [MergeSort](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/edit/main/README.md#método-de-ordenamiento-de-inserción-insertionsort)
6. [Conclusión](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/blob/main/README.md#conclusión)

## Introducción
Un método de ordenación es un algoritmo que permuta los datos de una estructura en una secuencia determinada. Los métodos de ordenación son especialmente útiles para que los datos que procesamos sean legibles por humanos y su procesamiento se agilice.

Existen diferentes metodos de ordenamiento, en este apartado veremos cinco metodos de ordenamiento, los cuales son: Ordenamiento de burbuja (BubbleSort), ordenamiento de burbuja bidireccional (CocktailSort). ordenamiento por insersion (InsertionSort), ordenamiento por mezcla (MergeSort), y ordenamiento shell (ShellSort)

## Método de Ordenamiento de la Burbuja (BubbleSort)
BubbleSort es un algoritmo de clasificación que compara dos elementos adyacentes y los intercambia hasta que estén en el orden deseado.

Al igual que el movimiento de las burbujas de aire en el agua que suben a la superficie, cada elemento de la matriz se mueve hasta el final en cada iteración. Por lo tanto, se le llama tipo burbuja.

[Implementación para BubbleSort](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/blob/main/BubbleSort/BubbleSort.java)

## Método de Ordenamiento de Selección (SelectionSort)
El ordenamiento por selección mejora el ordenamiento burbuja haciendo un sólo intercambio por cada pasada a través de la lista. Para hacer esto, un ordenamiento por selección busca el valor mayor a medida que hace una pasada y, después de completar la pasada, lo pone en la ubicación correcta. Al igual que con un ordenamiento burbuja, después de la primera pasada, el ítem mayor está en la ubicación correcta. Después de la segunda pasada, el siguiente mayor está en su ubicación. Este proceso continúa y requiere n−1 pasadas para ordenar los n ítems, ya que el ítem final debe estar en su lugar después de la (n−1)-ésima pasada.

[Implementación para SelectionSort](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/blob/main/SelectionSort/SelectionSort.java)

## Método de Ordenamiento de Inserción (InsertionSort)
InsertionSort es un algoritmo de clasificación simple que funciona insertando iterativamente cada elemento de una lista sin ordenar en su posición correcta en una porción ordenada de la lista. Es un algoritmo de clasificación estable, lo que significa que los elementos con valores iguales mantienen su orden relativo en la salida ordenada.

La clasificación por inserción es como clasificar naipes en las manos. Divides las cartas en dos grupos: las cartas ordenadas y las cartas sin clasificar. Luego, elige una tarjeta del grupo sin clasificar y la coloca en el lugar correcto del grupo ordenado.

[Implementación para InsertionSort](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/blob/main/InsertionSort/InsertionSort.java)

## Método de Ordenamiento por mezcla (MergeSort)
MergeSort es uno de los algoritmos de clasificación más populares que se basa en el principio del algoritmo divide y vencerá

[Implementación para MergeSort](https://github.com/GonzaPortillo/Estructura-de-Datos-Tema-5/blob/main/MergeSort/MergeSort.java)

## Conclusión
Los métodos de ordenamiento son algoritmos fundamentales en informática y tienen un amplio rango de aplicaciones prácticas, desde la organización de datos hasta la optimización de búsquedas. Estos algoritmos pueden clasificarse en varios tipos, cada uno con sus propias ventajas y desventajas, dependiendo del contexto y los datos específicos a ordenar. No existe un algoritmo de ordenamiento universalmente óptimo; cada uno tiene sus ventajas y es más adecuado para ciertas situaciones. La clave es entender las características de los datos y las restricciones del entorno para elegir el método de ordenamiento más eficiente y efectivo. Por esto, es esencial tener un conocimiento profundo de varios algoritmos y sus comportamientos en diferentes escenarios.
