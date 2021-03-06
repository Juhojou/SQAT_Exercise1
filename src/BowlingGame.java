import java.util.ArrayList;
import java.util.List;

//Finish time: 16:35
//ID: 109

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
	
	public void makeBonus(){
		Frame LastFrame = frames.get(9);
		if (LastFrame.isStrike()){
			frames.add(bonus);
		}
	}
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		score = score + firstThrow + secondThrow;
	}
	
	// Returns the game score
	public int score(){
		for (int k=0; k<10; k++){
			Frame Frame = frames.get(k);
			if (Frame.isSpare()){
				Frame NextFrameForSpare = frames.get(k+1);
				score = score + NextFrameForSpare.getFirstThrow();
				}
			if (Frame.isStrike()){
				Frame NextFrameForStrike = frames.get(k+1);
				score = score + NextFrameForStrike.score();
			}
			score = score + Frame.score();
		}
		return score;
	}
}
