package callbyvaluereferences;

public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue ob= new CallByValue();

        int x= 10;

        System.out.println("Before pass the value: " + x);

        ob.change(x);
        System.out.println("After passing the value: " + x);
    }
}
