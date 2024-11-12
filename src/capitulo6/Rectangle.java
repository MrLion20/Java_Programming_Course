package capitulo6;

public class Rectangle {

    private double length; //private = ningun otro codigo fuera de esta clase puede acceder a el
    protected double width;//protected = otras clases en el mismo paquete pueden acceder a el.

    //contructor dan valores por defecto
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length); //this.length = length; / Otra opcion
        setWidth(width);
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calcularPerimetro(){
        return(2 * length) + (2 * width);
    }
    public double calcularArea(){
        return length + width;
    }
}
