package by.training.shape.observer;

public interface TetrahedronObservable {
    void attach(TetrahedronObserver tetrahedronObserver);
    void detach();
    void notifyObservers();
}
