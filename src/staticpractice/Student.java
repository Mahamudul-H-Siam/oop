//package staticpractice;
//
//public class Student {
//    String name;
//    String id;
//    static String uniname= "United International University";
//
//    Student(String name, String id){
//        this.name= name;
//        this.id= id;
//    }
//
//    void display(){
//        System.out.println("Name: "+ name);
//        System.out.println("Id: "+ id);
//        System.out.println("University name: "+ uniname);
//    }
//}



//package staticpractice;
//
//public class Student{
//    String uniname= "United International University";
//    static String name= "Samia Hamid";
//}

//package staticpractice;
//public class Student{
//    static int count=0;
//
//    Student(){
//        count++;
//    }
//
//    void totalstudent(){
//        System.out.println("Count: "+ count);
//    }
//}

//package staticpractice;
//public class Student{
//    static int count=0;
//    Student(){
//        count++;
//    }
//    void totalstudent(){
//        System.out.println("Count: "+ count);
//}


//package staticpractice;
//public class Student{
//    static{
//        String id= "0112330944";
//        String name= "Md. Mahamudul Hasan";
//    }
//
//    void display(){
//        System.out.println("This is not a static method");
//    }
//
//    static void display2(){
//        System.out.println("This is a static method");
//    }
//
//    void display0(){
//        System.out.println("ID: "+ id);
//        System.out.println("Name: "+ name);
//    }
//}


//package staticpractice;
//public class Student{
//    static String id;
//    static String name;
//    static{
//        id= "0112330944";
//        name= "Md. Mahamudul Hasan";
//    }
//
//
//    static void display0(){
//        System.out.println("ID: "+ id);
//        System.out.println("Name: "+ name);
//    }
//}

package staticpractice;

import java.util.Random;

public class Student{
    public static void main(String[] args) {
//        Random rn= new Random();
//
//        int randomnumber= rn.nextInt(10);
//
//        System.out.println(randomnumber);
        int randomnumber= (int) (Math.random()*10);
        System.out.println(randomnumber);
    }
}