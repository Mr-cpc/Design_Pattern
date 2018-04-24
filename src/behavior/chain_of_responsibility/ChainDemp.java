package behavior.chain_of_responsibility;

/**
 * Created by waiting on 2018/4/19.
 */
public class ChainDemp {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        infoLogger.process("error",3);
    }
}
