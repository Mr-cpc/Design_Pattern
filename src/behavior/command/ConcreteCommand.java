package behavior.command;

/**
 * Created by waiting on 2018/3/29.
 */
public class ConcreteCommand implements Command {
    Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public ConcreteCommand(Receiver receiver) {

        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();

    }
}
