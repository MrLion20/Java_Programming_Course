package capitulo6;

public class calcularAreaCuarto {

    public static void main(String args[]){
        /*
        Rectangle #1
        */
        //Crear instancia para la clase Rectangle
        Rectangle cuarto1 = new Rectangle();
        cuarto1.setWidth(25);
        cuarto1.setLength(50);
        double areaCuarto1 = cuarto1.calcularArea();

        /*
        Rectangle #2
        */
        //Crear instancia para la clase Rectangle
        Rectangle cuarto2 = new Rectangle(30,75);
        double areaCuarto2 = cuarto2.calcularArea();
        double totalArea = areaCuarto1 + areaCuarto2;

        System.out.println("Area de ambos cuartos " + totalArea);

    }


}
