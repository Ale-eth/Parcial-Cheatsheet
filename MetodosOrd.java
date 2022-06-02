

// Ordenar burbuja ascendente
  for (int i = 0; i < (arreglo.length -1); i++) {
    for (int j = 0; j < (arreglo.length -1); j++) {
      if (arreglo[j] > arreglo[j+1]){
        auxiliar = arreglo[j];
        arreglo[j] = arreglo[j+1];
        arreglo[j+1] = auxiliar;
      }
    }
  }



// Ordenamiento por insercion
  for (int i = 0; i < (arreglo.length) ; i++) {
    posicion = i;
    auxiliar = arreglo[i];

    while ((posicion>0 && (arreglo[posicion-1] > auxiliar))){
      arreglo[posicion] = arreglo[posicion-1];
      posicion--;
    }
    arreglo[posicion] = auxiliar;
  }


// Buscar un elemento
int i=0;
  while(i < arreglo.length && !encontrado){
    if (arreglo[i] == numAbuscar){
      encontrado = true;
    }
    i++;
  }
