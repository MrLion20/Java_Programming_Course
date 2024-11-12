package capitulo6;

public class FacturaCelular {
    // id de factura
    private int id;
    // Costo Base
    private double costoBase;
    // Minutos asignados
    private int minutosBase;
    // Minutos utilizados
    private int minutosUtilizados;

    //contructor dan valores por defecto
    public FacturaCelular(){
        id = 0;
        costoBase = 10000;
        minutosBase = 30;
        minutosUtilizados = 30;
    }
    //contructor aceptar ID
    public FacturaCelular(int id){
       this.id = id;
        costoBase = 10000;
        minutosBase = 30;
        minutosUtilizados = 30;
    }
    //contructor aceptar todos campos
    public FacturaCelular(int id, double costoBase,int minutosBase, int minutosUtilizados){
        this.id = id;
        this.costoBase = costoBase;
        this.minutosBase = minutosBase;
        this.minutosUtilizados = minutosUtilizados;
    }
    //Asignacion de Datos
    //ID
    public double getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //CostoBase
    public double getCostoBase(){
        return costoBase;
    }
    public void setCostoBase(double costoBase){
        this.costoBase = costoBase;
    }
    //minutosBase
    public double getMinutosBase(){
        return costoBase;
    }
    public void setMinutosBase(int minutosBase){
        this.minutosBase = minutosBase;
    }
    //minutosUtilizados
    public double setMinutosUtilizados(){
        return minutosUtilizados;
    }
    public void setMinutosUtilizados(int minutosUtilizados){
        this.minutosUtilizados = minutosUtilizados;
    }

    public double calcularExcesoMinutos(){
        if (minutosUtilizados <= minutosBase){
            return 0;
        }
        double tarifaMinuto = 10.00;
        double minutosExceso = minutosUtilizados - minutosBase;
        return minutosExceso * tarifaMinuto;
        }

    public double impuesto(){
        double impuesto = 0.13;
        return impuesto *(costoBase + calcularExcesoMinutos());
    }
    public double calculateTotal(){
        return costoBase + calcularExcesoMinutos() + impuesto();
    }

    public void imprimirFactura(){
        System.out.println("ID: " + id);
        System.out.println("Tarifa Base: $" + costoBase);
        System.out.println("Exceso Minutos: $"
                + String.format("%.2f", calcularExcesoMinutos()));
        System.out.println("Impuesto: $"
                + String.format("%.2f", impuesto()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}
