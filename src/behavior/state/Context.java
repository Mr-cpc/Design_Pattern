package behavior.state;

/**
 * Created by waiting on 2018/3/29.
 */
public interface Context {

    public void setState(State state);
    public void doSth() ;
}
