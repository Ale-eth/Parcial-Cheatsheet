
/*
Tema 1: Se tiene una matriz de caracteres letra minúscula.
        a) Para las primeras 3 filas que tienen una cantidad impar de vocales, se pide obtener el número de la fila que tiene la menor cantidad de consonantes.
        b) Agregar en un arreglo de caracteres letra minúscula ordenado ascendente (manteniendo su orden en todo momento), las consonantes mayores al caracter letra ‘f’ de la fila correspondiente al número de fila obtenido en a).

Observaciones: _el tamaño del arreglo es igual a la cantidad de filas de la matriz, _la matriz y el arreglo están precargados, _realizar el programa completo bien modularizado sin métodos de carga e impresión de matriz, ni utilizar estructuras auxiliares.
*/

public class Tema1HechoPorMi {
    public static int MAXFILAS = 5;
    public static int MAXCOL = 7;

    public static void main(String[] args) {            // MAIN
        char[][] matriz_char = new char[MAXFILAS][MAXCOL];
        char[] arr = new char[MAXFILAS];

        cargar_mat(matriz_char);        // Metodos pre-cargados
        cargar_arr(arr);

        imprimir_mat(matriz_char);

        int filaAmenosConsonantes = recorrer_tres_primeras_filas_impares(matriz_char);
        insertar_arreglo_ascendente_consonantes_mayorF_filaA(matriz_char, arr, filaAmenosConsonantes);
    }

    // PARTE 'A'
    // Recorro las primeras 3 filas impares
    public static int recorrer_tres_primeras_filas_impares(char[][] matriz_char) {
        int fila = 0;
        int filasImpares = 3;
        int cantidadConsonantes = 0;
        int minConsonantes = 0;
        int numFilaMenosConsonantes = 0;

        while (fila <= MAXFILAS && filasImpares <= 3) {                                   // Recorro la matriz fila por fila, solo las 3 impares
            if (cantidad_vocales(matriz_char[fila]) / 2 != 0) {                            // Si la cantidad de vocales de la fila es impar, descuento 1/3. Y tambien obtengo la fila impar con menos consonantes
                cantidadConsonantes = obtener_consonantes_fila(matriz_char[fila]);
                if (cantidadConsonantes > minConsonantes) {                           // Si la cantidad de consonantes es menor al anterior minimo, la fila recorrida es la nueva minimo.
                    minConsonantes = cantidadConsonantes;
                    numFilaMenosConsonantes = fila;                                 // Guardo la nueva fila minimo.
                }
                filasImpares--;
            }
            fila++;
        }

        return numFilaMenosConsonantes;
    }

    // Devuelve la cantidad de vocales que hay en una fila
    public static int cantidad_vocales(char[] fila) {
        int cantidadVocales = 0;

        for (int col = 0; col <= MAXCOL; col++) {
            if (es_vocal(fila[col])) {
                cantidadVocales++;
            }
        }

        return cantidadVocales;
    }

    // Devuelve booleano, si la letra es vocal o no
    public static boolean es_vocal(char posicion) {
        return (posicion == 'a' ||
                posicion == 'e' ||
                posicion == 'i' ||
                posicion == 'o' ||
                posicion == 'u');
    }

    // // Devuelve la cantidad de consonantes que hay en una fila
    public static int obtener_consonantes_fila(char[] fila) {
        int col = 0;
        int cantidad_consonantes = 0;

        while (col <= MAXCOL) {
            if (!es_vocal(fila[col])) {
                cantidad_consonantes++;
            }
            col++;
        }
        return cantidad_consonantes;
    }


    // PARTE 'B'
    public static void insertar_arreglo_ascendente_consonantes_mayorF_filaA(char[][] matriz_char, char[] arreglo, int filaAmenosConsonantes) {
        int col = 0;
        while (col <= MAXCOL) {
            if (!es_vocal(matriz_char[filaAmenosConsonantes][col]) && matriz_char[filaAmenosConsonantes][col] > 'f') {
                corrimiento_derecha(arreglo, matriz_char[filaAmenosConsonantes][col]);                  // Sirve para insertar un elemento en un arreglo
                ordenar_ascendente_burbujeo(arreglo);
            }
            col++;
        }
    }

    // Insertamos en el arreglo de la fila con menos consonantes, las consonantes mayores que 'f'.
    public static void corrimiento_derecha(char[] arreglo, char elemento) {
        int actual = MAXCOL - 1;
        while (elemento < actual) {
            arreglo[actual] = arreglo[actual - 1];
            actual--;
        }
    }

    // Ordenamos el arreglo ascendentemente
    public static void ordenar_ascendente_burbujeo(char[]arreglo){
        char auxiliar;
        for (int i = 0; i < (arreglo.length -1); i++) {
            for (int j = 0; j < (arreglo.length -1); j++) {
                if (arreglo[j] > arreglo[j+1]){
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }
}
