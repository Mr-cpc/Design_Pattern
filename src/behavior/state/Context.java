package behavior.strategy.State;

/**
 * Created by waiting on 2018/3/29.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void doSth() {
        state.doSth(this);
        state = new ConcreteState1();
    }
}
