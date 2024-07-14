import java.util.Scanner;

public class Data {
    String name;
    String id;
    int number;
    int age;

    public Data() {
        System.out.println("There are no value passed by object");
    }
    public Data(String name, String id) {
        this.name= name;
        this.id= id;
    }
    public Data(String name, String id, int number) {
        this.name= name;
        this.id= id;
        this.number= number;
    }
    public Data(String name, String id, int number, int age) {
        this.name= name;
        this.id= id;
        this.number= number;
        this.age= age;
    }

    void display(){
        System.out.println(name+" "+id+" "+number+" "+age);
    }

}
