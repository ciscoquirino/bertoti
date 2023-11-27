import java.util.*;

public class TesteCambio {
    public static void main(String[] args) {
        final Model model = new Model();
        Controller controller = new Controller(model);
        
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
        	public void run() {
        		model.setCambio("5.04", "355.86");
        	}
        }, 7000);
        
        final Timer timer2 = new Timer();
	    timer2.schedule(new TimerTask() {
	        public void run() {
	        	model.setCambio("5.02", "357.30");
	        }
	    }, 15000);
        
    }
}