package behavior.state;

/**
 * Created by waiting on 2018/4/19.
 */
public class Person implements Context{
    private State state;
    int hour;
    public Person(State state) {
        this.state = state;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void doSth() {
        state.doSth(this);
    }
}
