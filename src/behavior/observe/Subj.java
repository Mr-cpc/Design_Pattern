package behavior.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by waiting on 2018/4/24.
 */
public class Subj {

    List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    public void notifyAllObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
