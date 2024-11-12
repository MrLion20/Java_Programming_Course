package capitulo7;

import java.util.Arrays;
import java.util.Random;

public class LoterryTiquete {

    private static final int LENGTH = 6;
    private static final int MAX_TIQUET_NUMBER = 69;

    public static void main(String[] args){
        int [] tiquete = generadorNumeros();
        //para ordenar de manera acendente los numero del Array.
        Arrays.sort(tiquete);
        imprimirTiquete(tiquete);
    }

    public static int[] generadorNumeros(){
        int[] tiquete = new int[LENGTH];
        Random random = new Random();

        for(int i = 0; i < LENGTH; i++){
            int numeroRandom;

            //Generar el numero random y luego buscar si no existe en el Array.
            do {
                numeroRandom = random.nextInt(MAX_TIQUET_NUMBER) + 1;
            }while (search(tiquete, numeroRandom));
             tiquete[i] = numeroRandom;
        }
        return tiquete;
    }

    /**
     * Esta secuencua busca un valor en un Array
     * @param array / Lista cual busca
     * @param numeroBuscar / valor que busca
     * @return true si lo encuentra o false si no
     */
    public static boolean search(int[] array, int numeroBuscar){
        //una nueva forma de Loop / Enhanced Loop

        for(int valor : array){
            if ( valor == numeroBuscar){
                return true;
            }
        }
        //si llega a este punto, no exite un numero repetido en el Array
        return false;
    }

    public static void imprimirTiquete(int tiquete[]) {
        for(int i = 0; i < LENGTH; i++){
            System.out.print(tiquete[i] + " | ");
        }
    }
}

