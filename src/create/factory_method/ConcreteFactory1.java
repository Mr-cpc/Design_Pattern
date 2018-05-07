package create.factory_method;

/**
 * Created by waiting on 2018/5/7.
 */
public class ConcreteFactory1 implements IFactory {

    @Override
    public Product create() {
        return new ConcreteProduct1();
    }
}
