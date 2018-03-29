package create.singleton_staticinnerclass;

/**
 * Created by waiting on 2018/3/29.
 */
public class Singleton {
    private Singleton() {
    }
    public static Singleton getInstance() {
        return InstanceHolder.singleton;
    }
    private static class InstanceHolder {
        private static Singleton singleton = new Singleton();
    }
}
