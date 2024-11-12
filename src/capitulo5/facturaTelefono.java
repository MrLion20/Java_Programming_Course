package capitulo5;/*
 * Calculo Factura Telefono
 * lo que se solicita es que se consulte la tarifa base del plan del telefono
 * adicional a esto cuantos minutos se paso de la base del plan, lo cual 
 * se le debe de cobrar 0.20 por cada minuto sobrepasado del plan y 15% de impuesto
 * en el subtotal
 */

import java.util.Scanner;

public class facturaTelefono {
    //Cosas que sabemos
    static double costoMinuto = 0.20;
    static double interes = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        //Cosas que no sabemos
        double tarifa = saberTarifa();
        int minutos = saberMinutos();
        scanner.close();
        //Calculo de Factura
        double exceso = calcularExceso(minutos);
        double subtotal = calcularSubtotal(tarifa,exceso);
        double montoImpuesto = calcularImpuesto(subtotal,interes);
        double total = calcularTotal(subtotal,montoImpuesto);
        //Notificar al cliente
        notificarCliente(tarifa,exceso,montoImpuesto,total);
    }
    public static double saberTarifa(){
        //Aca solicitamos al cliente que nos indique cuanto es el costo tarifa fija del plan
        System.out.println("Ingrese por favor su tarifa del plan de su telefono");
        double tarifa = scanner.nextDouble();
        return tarifa;
    }
    public static int saberMinutos(){
        //Aca solicitamos cuantos minutos de mas tiene en su mes
        System.out.println("Ingrese por favor los minutos sobrepasados del plan de este mes");
        int minutos = scanner.nextInt();
        return minutos;
    }
    public static double calcularExceso(int minutos){
        double exceso = minutos * costoMinuto;
        return exceso;
    }
    public static double calcularSubtotal(double tarifa, double exceso){
        double subtotal = tarifa + exceso;
        return subtotal;
    }
    public static double calcularImpuesto(double subtotal, double impuesto){
        double montoImpuesto = subtotal * impuesto;
        return montoImpuesto;
    }
    public static double calcularTotal (double subtotal, double montoImpuesto){
        double total = subtotal + montoImpuesto;
        return total;
    }
    public static void notificarCliente(double tarifa, double exceso, double impuesto, double total){
        System.out.println("Desglose de Factura Telefonica :" + "\nTarifa Fija del plan: ₡" + tarifa + "\nCosto de exceso de minutos: ₡" +
                exceso + "\nImpuesto: ₡" + impuesto+ "\nTotal: ₡" + total);
    }

}