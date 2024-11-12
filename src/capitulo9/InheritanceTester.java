package capitulo9;

public class InheritanceTester {

    public static void main(String[] args){

        Mother mom = new Mother();
        mom.setName("Lilliana");

        System.out.println(mom.getName());


        /*Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("Square");*/

    }
}
/**
 * Rules for the constructors in inheritance
 * #1 : Superclass constructors run first
 * #2 : Use 'super' to call specific constructors
 * #3 : super calls must be first
 * #4 : Some constructor must be executed / When superclass does not have a default constructor
 */