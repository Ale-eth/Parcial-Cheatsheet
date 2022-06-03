
// Corrimiento hacia izquierda. Sirve para eliminar una posicion
	public static void corrimiento_izq(int[] arr,int pos) {
		while (pos<MAX-1){
			arr[pos] = arr[pos+1];
			pos++;
		}
	}  


// Corrimiento hacia derecha. Sirve para insertar un elemento
	public static void corrimiento_der(int[] arr,int pos) {
		int actual = MAX-1;
		while (pos<actual){
			arr[actual] = arr[actual-1];
			actual--;
		}
	} 
