package gettersetter;

public class GetterSetterTest {
    public static void main(String[] args) {
        GetterSetter ob1= new GetterSetter();

        ob1.setName("Mahamudul Hasan");
        System.out.println(ob1.getName());
        ob1.setId("0112330944");
        System.out.println(ob1.getId());
        ob1.setAge(21);
        System.out.println(ob1.getAge());


        System.out.println();


        GetterSetter ob2= new GetterSetter();
        ob1.setName("Samia Hamid");
        System.out.println(ob1.getName());
        ob1.setId("0112330900");
        System.out.println(ob1.getId());
        ob1.setAge(22);
        System.out.println(ob1.getAge());
    }
}
