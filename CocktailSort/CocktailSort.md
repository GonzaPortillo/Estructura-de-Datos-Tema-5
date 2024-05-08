# CocktailSort (Ordenamiento de burbuja bidireccional)

El ordenamiento de burbuja bidireccional es una mejora de la ordenación en burbujas. Se utiliza principalmente como herramienta educativa.

Intenta mitigar un defecto de la clasificación por burbujas: el problema de los conejos y las tortugas. Se trata de una situación en la que se coloca una burbuja pesada al final de la matriz. Mientras las burbujas ligeras (conejos) ascienden rápidamente, la burbuja pesada (tortuga) desciende sólo una posición por cada iteración.

Este algoritmo acelerará las tortugas cambiando de dirección en cada iteración. Así, con cada cambio de dirección, los “conejos” se convierten en “tortugas” y viceversa. Esto no sólo permite que los elementos más grandes migren rápidamente al final de la lista, sino que también permite que los elementos más pequeños migren más rápido al principio.
