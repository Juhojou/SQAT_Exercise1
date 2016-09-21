import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test (expected =BowlingException.class)
	public void test_firstFrameNoPins() throws BowlingException{
		Frame frame = new Frame(0,0);
		assertEquals(1, frame.score());
	}

}
