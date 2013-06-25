import java.util.Timer;
import java.util.TimerTask;


public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TimerTask task = new RunMeTask();
		 
    	Timer timer = new Timer();
    	timer.schedule(task, 1000,60000);

	}

}
