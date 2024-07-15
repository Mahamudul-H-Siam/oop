package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        InheritanceSubClass ob= new InheritanceSubClass();

        ob.setName("Mahamudul Hasan");
        ob.setId("0112330944");
        ob.age= 21;

        ob.display();

        InheritanceSubClass ob2= new InheritanceSubClass();
        ob2.setName("Samia Hamid");
        ob2.setId("01123309__");
        ob2.age= 22;

        ob2.display();
    }
}
