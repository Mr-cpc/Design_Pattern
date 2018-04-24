package behavior.chain_of_responsibility;

/**
 * Created by waiting on 2018/4/19.
 */
public class InfoLogger extends Logger{
    @Override
    public void process(String message, int level) {
        if (level <= Logger.INFO_LEVEL)
            System.out.println(message);
        if (this.nextLogger != null)
            nextLogger.process(message,level);
    }
}
