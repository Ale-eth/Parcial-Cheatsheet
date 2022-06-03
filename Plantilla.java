import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio {
	    public static final int MAX = 10;

	    public static void main(String[] args) {
	        int[] ArregloVacio = new int[MAX];
        
        try{
          BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        }catch(Exception e){
        	System.out.println(exc);
        }
        
        
      }
  
  
	    public static void cargar_arreglo_aleatorio_int(int[] arr) {
	        Random r = new Random();
	        for (int pos = 0; pos < MAX; pos++) {
	            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
	        }
	    }
}
