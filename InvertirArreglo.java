for(int c=0; c<MAX/2; c++){
  aux = arreglo[c];
  arrelo[c] = arreglo[MAX-1-c];
  arreglo[MAX-1-c] = aux;
  }
