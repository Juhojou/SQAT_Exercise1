import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	
	@Test 
	public void test_firstFrameNoPins() throws BowlingException{
		Frame Frame = new Frame(0,0);
		assertEquals(0, Frame.score());
	}
	
	@Test
	public void test_gameHasTenFrames() throws BowlingException{
		BowlingGame game = new BowlingGame();
		for (int i=0; i<10; i++) {
			Frame Frame = new Frame(0,0);
			game.addFrame(Frame);
		}
		assertEquals(10, game.amountOfFrames());
	}
	
	@Test
	public void test_allFramesGotZeroPoints() throws BowlingException{
		BowlingGame Game = new BowlingGame();
		for (int i=0; i<10; i++) {
			Frame Frame = new Frame(0,0);
			Game.addFrame(Frame);
		}
		assertEquals(0, Game.score());
	}
	
	@Test
	public void test_allFramesGotOnePoint() throws BowlingException{
		BowlingGame game = new BowlingGame();
		for (int i=0; i<10; i++) {
			Frame Frame = new Frame(1,0);
			game.addFrame(Frame);
		}
		assertEquals(10, game.score());
	}
	
	@Test
	public void test_isFirtsFrameSpare() throws BowlingException{
		Frame Frame = new Frame(5,5);
		assertEquals(true, Frame.isSpare());
	}
	
	@Test
	public void test_isFirtsFrameStrike() throws BowlingException{
		Frame Frame = new Frame(5,5);
		assertEquals(false, Frame.isStrike());
	}
	
	@Test
	public void test_firstFrameIsSpareRestFramesGotOnePoint() throws BowlingException{
		BowlingGame game = new BowlingGame();
		Frame FirstFrame = new Frame(5,5);
		game.addFrame(FirstFrame);
		for (int i=0; i<9; i++) {
			Frame Frame = new Frame(1,0);
			game.addFrame(Frame);
		}
		assertEquals(20, game.score());
	}
	@Test
	public void test_allFramesAreSparesExceptLastFrameGotOnePoint() throws BowlingException{
		BowlingGame game = new BowlingGame();
		for (int i=0; i<9; i++) {
			Frame Frame = new Frame(5,5);
			game.addFrame(Frame);
		}
		Frame LastFrame = new Frame(1,0);
		game.addFrame(LastFrame);
		assertEquals(132, game.score());
	}
	
	@Test
	public void test_FirstFrameIsStrikeOthersGotOnePoint() throws BowlingException{
		BowlingGame game = new BowlingGame();
		Frame FirstFrame = new Frame(10,0);
		game.addFrame(FirstFrame);
		for (int i=0; i<9; i++) {
			Frame Frame = new Frame(1,0);
			game.addFrame(Frame);
		}
		assertEquals(20, game.score());
	}
	
	@Test
	public void test_FirstFourFramesAreStrikeOthersGotZeroPoints() throws BowlingException{
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		assertEquals(90, game.score());
	}
	
}
