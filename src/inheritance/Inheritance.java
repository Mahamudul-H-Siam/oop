package inheritance;

public class Inheritance {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    void displayfirst(){
        System.out.println("Name: "+ getName());
        System.out.println("Id: "+ getId());
    }
}
