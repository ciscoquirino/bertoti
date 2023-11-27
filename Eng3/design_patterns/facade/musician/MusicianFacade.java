public class MusicianFacade {
	Voice voice;
	Instrument instrument;
	
	public MusicianFacade(Voice voice, Instrument instrument) {
		this.voice = voice;
		this.instrument = instrument;
	}
	
	public void learn(String song) {
		voice.learn(song);
		instrument.learn(song);
	}
	
	public void play(String song) {
		voice.warmUp();
		instrument.play(song);
		voice.sing(song);
	}
	
	public void finish() {
		voice.stop();
		instrument.stop();
	}
}
