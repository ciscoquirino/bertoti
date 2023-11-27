public class Instrument {
	String desc;
	
	public Instrument(String desc) {
		this.desc = desc;
	}
	
	public void play(String song) {
		System.out.println(desc + " started to play " + song);
	}
	
	public void learn(String song) {
		System.out.println("Learning " + song + " on the " + desc);
	}
	
	public void stop() {
		System.out.println("...musician puts away the " + desc);
	}
}
