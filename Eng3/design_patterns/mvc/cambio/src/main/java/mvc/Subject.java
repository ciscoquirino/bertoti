package Eng3.design_patterns.mvc.cambio.src.main.java.mvc;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	public void setCambio(String br, String arg);
}
