package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import sannmoku.Sanmoku;

public class SanmokuTestCount {

	@Test
	public void testCount() {
		int gyou = 0;
		int retu = 0;
		int[][] board = new int[3][3];
		int count = 0;

		int result = Sanmoku.count(count, gyou, retu, board);
		assertThat(result, is(1));
	}

	@Test
	public void testCount2() {
		int gyou = 0;
		int retu = 0;
		int[][] board = new int[3][3];
		int count = 1;

		int result = Sanmoku.count(count, gyou, retu, board);

		assertThat(result, is(2));
	}
}
