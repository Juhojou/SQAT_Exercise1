import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test (expected =BowlingException.class)
	public void test_firstFrameNoPins() {
		Frame frame = new Frame(0,0);
		assertEquals("BowlingExpection", 0, frame.score());
	}

}
