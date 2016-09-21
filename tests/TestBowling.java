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
		BowlingGame Game = new BowlingGame();
		for (int i=0; i<10; i++) {
			Frame frame = new Frame(0,0);
			Game.addFrame(frame);
		}
		assertEquals(0, Game.score());
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
	
	@Test
	public void test_isFirtsFrameSpare() throws BowlingException{
		Frame frame = new Frame(5,5);
		assertEquals(true, frame.isSpare());
	}
	
	@Test
	public void test_isFirtsFrameStrike() throws BowlingException{
		Frame frame = new Frame(5,5);
		assertEquals(false, frame.isStrike());
	}
	
	@Test
	public void test_firstFrameIsSpareRestFramesGotOnePoint() throws BowlingException{
		BowlingGame game = new BowlingGame();
		Frame firstrame = new Frame(5,5);
		game.addFrame(frame);
		for (int i=0; i<19; i++) {
			Frame frame1 = new Frame(1,0);
			game.addFrame(frame1);
		}
		assertEquals(10, game.score());
	}

}
