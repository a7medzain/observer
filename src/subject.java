public interface subject {
    void add(observer observer);
    void remove(observer observer);
    void NotifyObservers();
}
