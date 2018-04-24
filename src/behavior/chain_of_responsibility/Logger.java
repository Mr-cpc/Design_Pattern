package behavior.chain_of_responsibility;


/**
 * Created by waiting on 2018/4/19.
 */
public abstract class Logger {
    public static final int INFO_LEVEL = 1;
    public static final int DEBUG_LEVEL = 2;
    public static final int ERROR_LEVEL = 3;
    protected Logger nextLogger;
    public abstract void process(String message,int level);

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
