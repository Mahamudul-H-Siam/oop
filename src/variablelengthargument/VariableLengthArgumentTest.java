package variablelengthargument;

public class VariableLengthArgumentTest {
    public static void main(String[] args) {
        VariableLengthArgument ob= new VariableLengthArgument();


        ob.add();
        ob.add(10);
        ob.add(10, 20);
        ob.add(10, 20, 30);
        ob.add(10, 20, 30, 40);
        ob.add(10, 20, 30, 40, 50);
        ob.add(10, 20, 30, 40, 50, 60);
    }
}
