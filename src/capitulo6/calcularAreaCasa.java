package capitulo6;

import java.util.Scanner;

public class calcularAreaCasa {
    Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        calcularAreaCasa calculadora = new calcularAreaCasa();
        Rectangle cocina = calculadora.getRoom();
        Rectangle comedor = calculadora.getRoom();

        double area = calculadora.calcularAreaTotal(cocina,comedor);
        System.out.println("El total del Area es: " + area);
        calculadora.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Ingrese la medida de largo del cuarto");
        double length = scanner.nextDouble() ;
        System.out.println("Ingrese la medida de ancho del cuarto");
        double width = scanner.nextDouble() ;
        return new Rectangle(length, width);
    }
    public double calcularAreaTotal(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calcularArea() + rectangle2.calcularArea();
    }
}
