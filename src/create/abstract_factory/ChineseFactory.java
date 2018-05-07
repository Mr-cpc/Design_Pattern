package create.abstract_factory;

/**
 * Created by waiting on 2018/5/7.
 */
public class ChineseFactory implements IFactory{
    @Override
    public ProductA prodecuA() {
        return new ChineseProductA();
    }

    @Override
    public ProductB prodecuB() {
        return new ChineseProductB();
    }

}
