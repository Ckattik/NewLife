package observerPattern;

public interface Subject {

ó	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
