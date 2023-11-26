package Eng3.design_patterns.facade.musician.src.main.java.facade;

public class Voice {
	String desc;
	
	public Voice(String desc) {
		this.desc = desc;
	}
	
	public void sing(String song) {
		System.out.println(desc + " started singing " + song);
	}
	
	public void learn(String song) {
		System.out.println(desc + " is learning the lyrics to " + song);
	}
	
	public void warmUp() {
		System.out.println(desc + " is warming up voice..");
	}
	
	public void stop() {
		System.out.println(desc + " gets down from stage and goes talk to girls in the audience...");
	}
}
