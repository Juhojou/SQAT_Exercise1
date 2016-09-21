public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int frameScore;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		frameScore = firstThrow + secondThrow; 
		return frameScore;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if (getFirstThrow() == 10)
			return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if (score() == 10)
			return true;
		return false;
	}
}
