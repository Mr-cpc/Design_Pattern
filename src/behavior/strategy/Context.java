package behavior.strategy;

/**
 * Created by waiting on 2018/3/29.
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy() {
        strategy.doStrategy();
    }
}
