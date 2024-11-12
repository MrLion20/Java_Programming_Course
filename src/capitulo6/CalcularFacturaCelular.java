package capitulo6;

public class CalcularFacturaCelular {
    public static void main(String args[]){
        /*caso enviado estandar solo enviando el ID adicional
        FacturaCelular factura = new FacturaCelular(12311);
        factura.imprimirFactura();
         */
        //Eviar dato de minutos utilizados para hacer la conversion respectiva
        FacturaCelular factura = new FacturaCelular(12311);
        factura.setMinutosUtilizados(100);
        factura.calcularExcesoMinutos();
        factura.impuesto();
        factura.imprimirFactura();
    }
}
