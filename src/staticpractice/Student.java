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

package staticpractice;
public class Student{
    static int count=0;

    Student(){
        count++;
    }

    void totalstudent(){
        System.out.println("Count: "+ count);
    }
}