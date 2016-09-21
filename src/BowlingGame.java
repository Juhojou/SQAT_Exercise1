import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	
	private int score;
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public int amountOfFrames() {
		return frames.size();
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		for (int k=0; k<10; k++){
			Frame frame = frames.get(k);
			score = score + frame.score();
			if (frame.isSpare() == true){
				Frame nextFrame = frames.get(k+1);
				score = score + nextFrame.getFirstThrow();
				}
		}
		return score;
	}
}
