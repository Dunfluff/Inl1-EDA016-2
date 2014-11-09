package inl1;
import se.lth.cs.window.SimpleWindow;

public class RaceTrack {
	private int yStart,yFinish;
	/** Skapar en kapplöpningsbana. yStart och yFinish är
	y-koordinaterna för start- och mållinje */
	public RaceTrack(int yStart, int yFinish){
		this.yStart = yStart;
		this.yFinish = yFinish;
	}
	
	/** Ritar kapplöpningsbanan i fönstret w */
	public void Draw(SimpleWindow w){
		w.moveTo(0, yStart);
		w.lineTo(600, yStart);
		w.moveTo(0, yFinish);
		w.lineTo(600, yFinish);
	}
	
	/** Returnerar yStart*/
	public int GetStart(){
		return yStart;
	}
	
	/** Returnerar yFiinish*/
	public int GetFinish(){
		return yFinish;
	}
	
}
