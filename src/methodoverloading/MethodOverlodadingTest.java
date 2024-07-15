package methodoverloading;

public class MethodOverlodadingTest {
    public static void main(String[] args) {
        MethodOverloading ob= new MethodOverloading();
        ob.add();
        ob.add(1, 3);
        ob.add(1, 3, 4);
        ob.add(3.3, 4.8);
        ob.add(3.3, 4.8, 2.5);
    }
}
