import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_firstFrameNoPins() {
		Frame frame = new Frame(0,0);
		assertEquals(0, 0);
	}

}
