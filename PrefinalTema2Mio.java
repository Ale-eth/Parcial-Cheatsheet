// a) Considerando solo las columnas que tienen caracteres letra minúscula, se pide obtener el número de la columna que tiene la menor cantidad de consonantes menores al caracter ‘m’.
//  b) Determinar si en un arreglo dado de caracteres letra minúscula ordenado ascendente, están todas las consonantes incluídas en la columna correspondiente al número de columna obtenido en a).

//  Observaciones: _el tamaño del arreglo es igual a la cantidad de columnas de la matriz,
//                 _la matriz y el arreglo están precargados,
//                 _realizar el programa completo bien modularizado sin métodos de carga e impresión de matriz, ni utilizar estructuras auxiliares.

public class tema2 {

    final static int MAXCOL = 10;
    final static int MAXFIL = 10;

    static int menos_m = -1;
    static int col_menos_m = -1;

    public static void main(String[] args) {
        char[][] mat = new char[MAXFIL][MAXCOL];
        char[] arr = new char[MAXCOL];

        cargar_matriz();
        cargar_arreglo();
        imprimir_matriz();

        recorrer_mat(mat);
        recorrer_col(mat, arr);

    }

    // Parte A
    public static void recorrer_mat(char[][]mat){
        for(int c=0; c<= MAXCOL; c++){
            if(comprobar_col_todas_min(c, mat)){
                if(comprobar_cantidad_menores_m(mat, c) >= menos_m){
                    col_menos_m = c;
                }
            }

        }
    }

    public static boolean comprobar_col_todas_min(int col, char[][]mat){
        int f = 0;
        int max_cons_menores_m = MAXFIL;

        while(f <= MAXFIL){
            if(mat[f][col] < 'a' && mat[f][col] > 'z'){
                max_cons_menores_m--;
            }
            f++;
        }

        return max_cons_menores_m == 0;
    }

    public static int comprobar_cantidad_menores_m(char[][]mat, int col){
        int f = 0;
        int cant_menor_m = 0;

        while(f <= MAXFIL){
            if(mat[f][col] > 'm' && mat[f][col] < 'z'){
                cant_menor_m++;
            }
        }

        return cant_menor_m;
    }

    // Parte B
    public static void recorrer_col(char[][] mat, char[]arr){
        for(int f=0; f<=MAXFIL; f++){
            if(mat[f][col_menos_m] != 'a' && mat[f][col_menos_m] != 'e' && mat[f][col_menos_m] != 'i' && mat[f][col_menos_m] != 'o' && mat[f][col_menos_m] != 'u') {
                comprobar_si_existe_en_arreglo(mat[f][col_menos_m], arr);
            }
        }
    }
    public static boolean comprobar_si_existe_en_arreglo(char caracter, char[] arr){
        boolean encontrado = false;
        for(int c=0; c<= MAXCOL; c++){
            if(caracter == arr[c]){
                encontrado = true;
                break;
            }else{
                encontrado = false;
            }
        }
        
        return encontrado;
    }

    public static void cargar_matriz(){}
    public static void cargar_arreglo(){}

    public static void imprimir_matriz(){}
}
