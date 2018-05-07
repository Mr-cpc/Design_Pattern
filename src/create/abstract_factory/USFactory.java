package create.abstract_factory;

/**
 * Created by waiting on 2018/5/7.
 */
public class USFactory implements IFactory{
    @Override
    public ProductA prodecuA() {
        return new USProductA();
    }

    @Override
    public ProductB prodecuB() {
        return new USProductB();
    }
}
