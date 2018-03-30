package create.simple_factory;

/**
 * Created by waiting on 2018/3/30.
 */
public class SimpleFactory {
    public static Product produce(String productType) {
        switch (productType) {
            case "type1":
                return new ConcreteProduct1();
            case "type2":
                return new ConcreteProduct2();
        }
        return null;
    }
}
