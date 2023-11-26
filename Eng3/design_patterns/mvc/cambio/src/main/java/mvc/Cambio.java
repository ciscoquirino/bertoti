package Eng3.design_patterns.mvc.cambio.src.main.java.mvc;
import java.util.*;

public class Cambio {
    public static void main(String[] args) {
        final Model model = new Model();
        Controller controller = new Controller(model);
        
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
        	public void run() {
        		model.setCambio("5.04", "355.86");
        	}
        }, 5000);
        
        final Timer timer2 = new Timer();
	    timer2.schedule(new TimerTask() {
	        public void run() {
	        	model.setCambio("5.02", "357.30");
	        }
	    }, 10000);
        
    }
}