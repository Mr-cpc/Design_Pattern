package behavior.state;

/**
 * Created by waiting on 2018/4/19.
 */
public class GetUp implements State{
    @Override
    public void doSth(Context context) {
        Person p = (Person) context;
        if (p.getHour() == 7)
            System.out.println("get up!");
        else {
            p.setState(new GetUp());
            p.doSth();
        }

    }
}
