package boxvolumn;

public class BoxVolumn {
    public static void main(String[] args) {
        Box b1= new Box(10, 10, 10);
        Box b2= new Box(20, 30, 10);
        b1.getvolumn();
        b2.getvolumn();


        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(0.10));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.sqrt(4));
        System.out.println((int)(Math.random()*10+1));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.PI);
        System.out.println(Math.exp(1.0));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Math.log(1));
        System.out.println(Math.max(1.57, -4.58));
        System.out.println(Math.min(1.57, -4.58));
        System.out.println(Math.min(3, 1));
        System.out.println(Math.ceil(-5.5));
        System.out.println(Math.floor(-5.5));
        System.out.println(Math.ceil(10.36));
        System.out.println(Math.floor(11.99));
    }
}
