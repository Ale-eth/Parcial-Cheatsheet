// a) Considerando solo las columnas que tienen caracteres letra minúscula, se pide obtener el número de la columna que tiene la menor cantidad de consonantes menores al caracter ‘m’.
//  b) Determinar si en un arreglo dado de caracteres letra minúscula ordenado ascendente, están todas las consonantes incluídas en la columna correspondiente al número de columna obtenido en a).
//  Observaciones: _el tamaño del arreglo es igual a la cantidad de columnas de la matriz, _la matriz y el arreglo están precargados, _realizar el programa completo bien modularizado sin métodos de carga e impresión de matriz, ni utilizar estructuras auxiliares.
public class Tema2HechoPorMi {
    public static int MAXFILAS = 5;
    public static int MAXCOL = 7;

    public static void main(String[] args) {
        char[][] mat = new char[MAXFILAS][MAXCOL];
        char[] arr = new char[MAXCOL];

        boolean todas_letras_minusculas = true;

        int cantidad_consonantes_menores_m = 0;
        int min_cantidad_consonantes_menores_m = 0;
        int col_menos_consonantes_menores_m = -1;

        int fila = 0;
        for (int c = 0; c <= MAXCOL; c++){
            fila = 0;
            while (fila <= MAXFILAS && todas_letras_minusculas == true){
                if((mat[fila][c] >= 'a' && mat[fila][c] <= 'z')){
                    todas_letras_minusculas = true;

                    if(!es_vocal(mat[fila][c]) && mat[fila][c] < 'm'){
                        cantidad_consonantes_menores_m++;
                    }
                }else{
                    todas_letras_minusculas = false;
                }
                fila++;
            }

            if(cantidad_consonantes_menores_m < min_cantidad_consonantes_menores_m){
                min_cantidad_consonantes_menores_m = cantidad_consonantes_menores_m;
                col_menos_consonantes_menores_m = c;
            }
        }

        comprobar_todas_consonantes_en_arreglo(col_menos_consonantes_menores_m, arr, mat, cantidad_consonantes_menores_m);

    }

    public static boolean es_vocal(char letra){
        return (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');
    }

    public static boolean comprobar_todas_consonantes_en_arreglo(int col, char[] arr, char[][] mat, int cantidad_consonantes){
        int consonantes = cantidad_consonantes;
        boolean encontrado = false;
        int total
        for(int f=0; f<= MAXFILAS; f++){
            for(int c=0; c<= arr.length; c++){
                if(mat[f][col] == arr[c]){
                    consonantes--;
                }
            }
        }
        if(consonantes < cantidad_consonantes){
            return false;
        }
    }
}
