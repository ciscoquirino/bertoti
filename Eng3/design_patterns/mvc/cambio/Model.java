import java.util.*;

public class Model implements Subject{
	private ArrayList observers;
	private String br;
	private String arg;
	
	public Model() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observermvc o) {
		observers.add(o);
	}
	
	public void removeObserver(Observermvc o) {
		int i = observers.indexOf(o);
		if (i>=0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			Observermvc observer = (Observermvc)observers.get(i);
			observer.update(br, arg);
		}
	}
	
	public void cambioChanged() {
		notifyObservers();
	}
	
	public void setCambio(String br, String arg) {
		this.br = br;
		this.arg = arg;
		cambioChanged();
	}
	
	public String getBr() {
		return br;
	}
	
	public String getArg() {
		return arg;
	}

}
