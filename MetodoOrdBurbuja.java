

  // Metodo burbuja ascendente
  for (int i = 0; i < (arreglo.length -1); i++) {
      for (int j = 0; j < (arreglo.length -1); j++) {
          if (arreglo[j] > arreglo[j+1]){
              auxiliar = arreglo[j];
              arreglo[j] = arreglo[j+1];
              arreglo[j+1] = auxiliar;
          }
      }
  }