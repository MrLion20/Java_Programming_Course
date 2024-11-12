package capitulo5;

import java.util.Scanner;
//programa pequeño con el fin de practicar el llamado de un metodo sencillo
public class Greetings {

    public static void main(String args[]){

        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);

    }
    public static void greetUser(String name){
        System.out.println("Hi there " + name);
    }
}
