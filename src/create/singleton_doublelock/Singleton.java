package create.singleton_doublelock;

/**
 * Created by waiting on 2018/3/29.
 */
public class Singleton {
    private static volatile Singleton SINGLETON;

    private Singleton(){}

    public static Singleton getInstance() {
        if (SINGLETON == null) {
            synchronized (Singleton.class) {
                if (SINGLETON == null)
                    SINGLETON = new Singleton();
            }
        }
        return SINGLETON;
    }
}
