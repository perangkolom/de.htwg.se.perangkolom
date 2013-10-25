package game_StructureElements;

import static org.junit.Assert.*;

import org.junit.Test;

public class BorderTest {

	@Test
	public void test() {
		Border LeftBorder = new Border(true, true);
		assertNotNull(LeftBorder);
	}

}
