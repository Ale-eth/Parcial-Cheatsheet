/*
Suponer que se tienen dos arreglos A y B de secuencias (de caracteres separados por uno o
más espacio) de tamaño MAX (arreglo empieza y termina con uno o más caracteres
espacio). A y B que están precargadas, y además se tienen los siguientes métodos (existen y
no se tienen que implementar):
    a) un método que permite obtener el índice inicial de la secuencia que más se repite de un
    arreglo de secuencias de tamaño MAX (que empieza y termina con o más caracteres
    espacios).
    b) un método que retorna el índice inicial de la secuencia que tiene más caracteres
    repetidos de un arreglo de secuencias (de caracteres separados por uno o más caracteres
    espacio) de tamaño MAX (que empieza y termina con espacio).

    Se pide realizar un programa completo que (sin utilizar arreglos auxiliares/extras a los
    mencionados):
        _reemplace en A la secuencia que más se repite por la secuencia de B con más
        caracteres repetidos (la separación previa entre las secuencias de A debe mantenerse).
        En caso de utilizar uno o más de los métodos preexistentes mencionados en el enunciado
        definir el o los encabezados de los mismos. No se requiere hacer métodos de carga e
        impresión de arreglos.
*/

public class Ej17 {
    final static int MAX = 10;

    public static void main(String[] args) {
        char[] A = new char[MAX];
        char[] B = new char[MAX];

        cargar_arreglo_secuencias_char(A);
        cargar_arreglo_secuencias_char(B);

        reemplazar(A, B);

        imprimir_arreglo(A, B);
    }

    public static void cargar_arreglo_secuencias_char(char[] A, char[] B) {
    }

    public static void reemplazar(char[] A, char[] B) {
        int inicioPosSecA = posInicioSecuenciaMasRep(A);
        int finPosSecA = posFinSecuenciaMasRep(A, inicioPosSecA);

        int inicioPosSecMasCarRepB = posInicioSecuenciaMasCaracteresRepetidos(B);
        int finPosSecMasCarRepB = posFinalSecuenciaMasCaracteresRepetidos(B, inicioPosSecMasCarRepB);

        int tamañoSecA = finPosSecA - inicioPosSecA;
        int tamañoSecB = finPosSecMasCarRepB - inicioPosSecMasCarRepB;

        if (tamañoSecA > tamañoSecB) {
            corrimiento_izquierda(A, inicioPosSecA);
        } else if (tamañoSecA < tamañoSecB) {
            corrimiento_derecha(A, inicioPosSecA);
        }

        reemplazo(A, B, inicioPosSecA, finPosSecA, inicioPosSecMasCarRepB, finPosSecMasCarRepB);
    }


    public static int posInicioSecuenciaMasRep(char[] arr) {
        int pos = 0;
        return pos;
    }

    public static int posFinSecuenciaMasRep(char[] arr, int inicioPos) {
        while (arr[inicioPos] != ' ' && inicioPos < MAX - 1) {
            inicioPos++;
        }
        return inicioPos - 1;
    }

    public static int posInicioSecuenciaMasCaracteresRepetidos(char[] arr) {
        int pos = 0;
        return pos;
    }

    public static int posFinalSecuenciaMasCaracteresRepetidos(char[] arr, int inicioPos) {
        while (arr[inicioPos] != ' ' && inicioPos < MAX - 1) {
            inicioPos++;
        }
        return inicioPos - 1;
    }

    public static void corrimiento_derecha(char[] A, int inicioA) {
        for (int i = MAX - 1; i > inicioA; i--) {
            A[i] = A[i - 1];
        }
    }

    public static void corrimiento_izquierda(char[] A, int inicioA) {
        for (int i = inicioA; i < MAX - 1; i++) {
            A[inicioA] = A[inicioA + 1];
        }
    }

    public static void reemplazo(char[] A,char[] B, int inicioA, int finA, int inicioB, int finB ){
        while (inicioB<=finB){
            A[inicioA]=B[inicioB];
            inicioA++;
            inicioB++;
        }
    }

    public static void imprimir_arreglo(){}
}
