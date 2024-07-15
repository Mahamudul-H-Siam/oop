package callbyvaluereferences;

public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference ob= new CallByReference();

        ob.x= 200;
        System.out.println("Before calling by reference: "+ ob.x);


        ob.change(ob);
        System.out.println("After calling by reference: "+ ob.x);
    }
}
