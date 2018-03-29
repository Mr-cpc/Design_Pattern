package behavior.template_method;

/**
 * Created by waiting on 2018/3/29.
 */
public abstract class AbstractClass {

    protected abstract void processOne();

    protected abstract void processTwo();

    public final void templateMethod() {
        processOne();
        processTwo();
    }
}
