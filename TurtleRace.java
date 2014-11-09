package inl1;

import lab4.Turtle;
import se.lth.cs.window.SimpleWindow;

public class TurtleRace {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600,600,"TurtleRace");
		
		RaceTrack Track = new RaceTrack(500, 100);
		Track.Draw(w);
		
		Turtle t1 = new Turtle(w, w.getWidth()/5 , Track.GetStart());
		Turtle t2 = new Turtle(w, w.getWidth()-w.getWidth()/5 , Track.GetStart());
		
		RacingEvent TurtleRace = new RacingEvent(Track, t1, t2);
	}

}
