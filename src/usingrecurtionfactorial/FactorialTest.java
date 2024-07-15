package usingrecurtionfactorial;

public class FactorialTest {
    public static void main(String[] args) {
        Factorial ob= new Factorial();

        int result= ob.fact(5);
        System.out.println("Factorial value is: "+ result);

        result= ob.fact(6);
        System.out.println("Factorial value is: "+ result);

        result= ob.fact(7);
        System.out.println("Factorial value is: "+ result);
    }
}
