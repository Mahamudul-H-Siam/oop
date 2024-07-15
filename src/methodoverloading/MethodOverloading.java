package methodoverloading;

public class MethodOverloading {
    void add(){
        System.out.println("There is nothing value pass here.");
    }
    void add(int a, int b){
        System.out.println("Two integer value summation: "+ (a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Three integer value summation:"+ (a+b+c));
    }
    void add(double a, double b){
        System.out.println("Two double value summation:"+ (a+b));
    }
    void add(double a, double b, double c){
        System.out.println("Three double value summation: "+ (a+b+c));
    }
}
