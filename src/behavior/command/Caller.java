package behavior.command;

/**
 * Created by waiting on 2018/3/29.
 */
public class Caller {
    public void call(Command command) {
        command.execute();
    }
}
