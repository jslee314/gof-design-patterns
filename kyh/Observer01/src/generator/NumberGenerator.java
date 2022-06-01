package generator;

import observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();        // Observer들을 보관

    public void addObserver(Observer observer) {    // Observer를 추가
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) { // Observer를 삭제
        observers.remove(observer);
    }

    public void notifyObservers() {               // Observer에 통지
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();                // 수를 취득한다.
    public abstract void execute();
}
