package struct.Facade;

/**
 * Created by waiting on 2018/4/2.
 */
public class Facade {
    SubSystemB subSystemB;
    SubSystemA subSystemA;
    public Facade(SubSystemA subSystemA,SubSystemB subSystemB) {
        this.subSystemA = subSystemA;
        this.subSystemB = subSystemB;
    }
    public void open(){
        subSystemA.turn_on();
        subSystemB.turn_on();
    }
    public void close() {
        subSystemB.turn_off();
        subSystemA.turn_off();
    }

}
