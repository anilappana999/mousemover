import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class Mover {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		
	int X_COR=400;
	int Y_COR=400;
int time=2000;
		
		
		Robot robo = new Robot();
		
		Random random = new Random();
		

		while(true) {
			
			robo.mouseMove(random.nextInt(X_COR), random.nextInt(Y_COR));
			
			Thread.sleep(time);
			
			
			
			
		}
		
		
	}

}
