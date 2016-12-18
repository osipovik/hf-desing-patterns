package oik.designpatterns.observer.models.subject;

import oik.designpatterns.observer.models.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
