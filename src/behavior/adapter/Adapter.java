package behavior.adapter;

/**
 * Created by waiting on 2018/3/29.
 */
public class Adapter implements TargetInterface{
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void fun() {
        adaptee.fun();
    }
}
