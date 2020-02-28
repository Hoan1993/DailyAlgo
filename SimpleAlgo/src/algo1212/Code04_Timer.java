package algo1212;

import java.awt.Toolkit;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Code04_Timer {

	Toolkit tool = Toolkit.getDefaultToolkit();
	
	TimerTask time_task = new TimerTask() {
		public void run() {
			System.out.println("Hi");
			try {
				Thread.sleep(2000);
				tool.beep();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	};
	
	public void getInput() {
		Timer timer = new Timer();
		Scanner kb = new Scanner(System.in);
		int myTime = kb.nextInt();
		
		timer.schedule(time_task, 1000*myTime);
		kb.close();
	}
	
	
	
	
	public static void main(String[] args) {
		Code04_Timer app = new Code04_Timer();
		app.getInput();

	}

}
