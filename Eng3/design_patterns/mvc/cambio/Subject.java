public interface Subject {
	public void registerObserver(Observermvc o);
	public void removeObserver(Observermvc o);
	public void notifyObservers();
	public void setCambio(String br, String arg);
}
