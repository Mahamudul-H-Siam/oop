package boxvolumn;

public class Box {
    double height;
    double weight;
    double depth;

    Box(double height, double weight, double depth){
        this.height= height;
        this. weight= weight;
        this.depth= depth;
    }

    void getvolumn(){
        double volumn=  height*weight*depth;

        System.out.println("Box volumn is: "+ volumn);
    }
}
