package inl1;
import java.util.Random;

import se.lth.cs.window.SimpleWindow;
import lab4.Turtle;


public class RacingEvent{
	private Random rand = new Random();

	public RacingEvent(RaceTrack track, Turtle t1, Turtle t2){
		while(t1.getY() > track.GetFinish() && t2.getY() > track.GetFinish()){
			t1.penDown();
			t2.penDown();
			t1.forward(rand.nextInt(2));
			t2.forward(rand.nextInt(2));
			SimpleWindow.delay(10);
			}
		if(t1.getY()<t2.getY()){
			System.out.println("Turtle 1 Vann");
			
			}
		else{
			System.out.println("Turtle 2 Vann");
			}
	}

}
