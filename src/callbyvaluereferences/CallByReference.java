package callbyvaluereferences;

public class CallByReference {
    int x;

    void change(CallByReference ob2){
        ob2.x= 500;
    }
}
