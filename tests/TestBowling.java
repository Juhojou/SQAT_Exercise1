import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBowling {
	
	@Test
	public void test_firstFrameNoPins() throws BowlingException{
		Frame frame = new Frame(0,0);
		assertEquals(0, frame.score());
	}
	
	@Test
	public void test_gameHasTenFrames() throws BowlingException{
		BowlingGame game = new BowlingGame();
		for (int i=0; i<10; i++) {
			Frame frame = new Frame(0,0);
			game.addFrame(frame);
		}
		assertEquals(10, game.amountOfFrames());
	}
	
	@Test
	public void test_allFramesGotZeroPoints() throws BowlingException{
		BowlingGame game = new BowlingGame();
		for (int i=0; i<10; i++) {
			Frame frame = new Frame(0,0);
			game.addFrame(frame);
		}
		assertEquals(0, game.score());
	}
	
	@Test
	public void test_allFramesGotOnePoint() throws BowlingException{
		BowlingGame game = new BowlingGame();
		for (int i=0; i<10; i++) {
			Frame frame = new Frame(1,0);
			game.addFrame(frame);
		}
		assertEquals(10, game.score());
	}

}
