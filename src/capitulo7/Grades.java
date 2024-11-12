package capitulo7;

import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Cuantos grados le gustaria ingresar?");
        grades = new int[scanner.nextInt()];
        getGrades();
    }

    public static void getGrades(){
        for(int i=0; i<grades.length; i++){
            System.out.println("ingrese grado #" + (i+1));
            grades[i] = scanner.nextInt();

        }
    }


}
