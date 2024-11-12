package capitulo5;

import java.util.Scanner;
/*
 * VARIABLE SCOPE
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class instantCreditCheck {
    // Cosas que conocemos
    static int salarioRequerido = 25000;
    static int recordCrediticioRequerido = 700;
    static Scanner scanner = new Scanner(System.in);

public static void main(String args[]){

    //Cosas que no conocemos 
    double salario = saberSalario();
    int record = saberRecord();
    scanner.close();

    //Revisar si el cliente califica
    boolean califica = siClienteCalifica(record, salario);

    //Notificar al usuario 
    notificarUsuario(califica);
}
public static double saberSalario(){
    //Pendimos que ingrese el monto del salario y lo guardamos en una variable
    System.out.println("Ingrese su salario:");
    double salario = scanner.nextDouble();
    return salario;
}

public static int saberRecord(){
    //Pedimos que ingrese el record crediticio y lo guardamos en una variable
    System.out.println("Ingrese su puntaje de record crediticio:");
    int recordCrediticio = scanner.nextInt();
    return recordCrediticio;
}

public static boolean siClienteCalifica(int record, double salario){
    if (record >= recordCrediticioRequerido && salario >= salarioRequerido) {
        return true;
    }else{
        return false;
    }
}

public static void notificarUsuario(boolean siCalifica){
    if (siCalifica) {
        System.out.println("Felicicdades, has calificado.");
    }else{
        System.out.println("Lo siento,No has calificado.");
    }
}
}

