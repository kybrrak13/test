package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import sannmoku.Sanmoku;

public class SanmokuTestBoard {
	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(0,0)に置く
	 *
	 * 100
	 * 000
	 * 000
	 *
	 */
	@Test
	public void testBoard() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(0,0)に置く
		int count = 0;
		int gyou = 0;
		int retu = 0;
		Sanmoku.count(count, gyou, retu, board);

		//100
		//000
		//000
		assertThat(board[0][0], is(1));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(0,1)に置く
	 *
	 * 010
	 * 000
	 * 000
	 *
	 */
	@Test
	public void testBoard2() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(0,1)に置く
		int count = 0;
		int gyou = 0;
		int retu = 1;
		Sanmoku.count(count, gyou, retu, board);

		//010
		//000
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(1));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(0,2)に置く
	 *
	 * 001
	 * 000
	 * 000
	 *
	 */
	@Test
	public void testBoard3() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(0,2)に置く
		int count = 0;
		int gyou = 0;
		int retu = 2;
		Sanmoku.count(count, gyou, retu, board);

		//010
		//000
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(1));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(1,0)に置く
	 *
	 * 000
	 * 100
	 * 000
	 *
	 */
	@Test
	public void testBoard4() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(1,0)に置く
		int count = 0;
		int gyou = 1;
		int retu = 0;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//100
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(1));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(1,1)に置く
	 *
	 * 000
	 * 010
	 * 000
	 *
	 */
	@Test
	public void testBoard5() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(1,1)に置く
		int count = 0;
		int gyou = 1;
		int retu = 1;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//010
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(1));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(1,2)に置く
	 *
	 * 000
	 * 001
	 * 000
	 *
	 */
	@Test
	public void testBoard6() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(1,2)に置く
		int count = 0;
		int gyou = 1;
		int retu = 2;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//001
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(1));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(2,0)に置く
	 *
	 * 000
	 * 000
	 * 100
	 *
	 */
	@Test
	public void testBoard7() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(2,0)に置く
		int count = 0;
		int gyou = 2;
		int retu = 0;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//000
		//100
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(1));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(2,1)に置く
	 *
	 * 000
	 * 000
	 * 010
	 *
	 */
	@Test
	public void testBoard8() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(2,1)に置く
		int count = 0;
		int gyou = 2;
		int retu = 1;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//000
		//010
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(1));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(2,2)に置く
	 *
	 * 000
	 * 000
	 * 001
	 *
	 */
	@Test
	public void testBoard9() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー1が(2,2)に置く
		int count = 0;
		int gyou = 2;
		int retu = 2;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//000
		//001
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(1));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(0,0)に置く
	 *
	 * 200
	 * 000
	 * 000
	 *
	 */
	@Test
	public void testBoard10() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(0,0)に置く
		int count = 1;
		int gyou = 0;
		int retu = 0;
		Sanmoku.count(count, gyou, retu, board);

		//200
		//000
		//000
		assertThat(board[0][0], is(2));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));

	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(0,1)に置く
	 *
	 * 020
	 * 000
	 * 000
	 *
	 */
	@Test
	public void testBoard11() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(0,1)に置く
		int count = 1;
		int gyou = 0;
		int retu = 1;
		Sanmoku.count(count, gyou, retu, board);

		//020
		//000
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(2));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(0,2)に置く
	 *
	 * 002
	 * 000
	 * 000
	 *
	 */
	@Test
	public void testBoard12() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(0,2)に置く
		int count = 1;
		int gyou = 0;
		int retu = 2;
		Sanmoku.count(count, gyou, retu, board);

		//020
		//000
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(2));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(1,0)に置く
	 *
	 * 000
	 * 200
	 * 000
	 *
	 */
	@Test
	public void testBoard13() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(1,0)に置く
		int count = 1;
		int gyou = 1;
		int retu = 0;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//200
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(2));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(1,1)に置く
	 *
	 * 000
	 * 020
	 * 000
	 *
	 */
	@Test
	public void testBoard14() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(1,1)に置く
		int count = 1;
		int gyou = 1;
		int retu = 1;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//020
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(2));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(1,2)に置く
	 *
	 * 000
	 * 002
	 * 000
	 *
	 */
	@Test
	public void testBoard15() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(1,2)に置く
		int count = 1;
		int gyou = 1;
		int retu = 2;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//002
		//000
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(2));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(2,0)に置く
	 *
	 * 000
	 * 000
	 * 200
	 *
	 */
	@Test
	public void testBoard16() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(2,0)に置く
		int count = 1;
		int gyou = 2;
		int retu = 0;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//000
		//200
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(2));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(2,1)に置く
	 *
	 * 000
	 * 000
	 * 020
	 *
	 */
	@Test
	public void testBoard17() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(2,1)に置く
		int count = 1;
		int gyou = 2;
		int retu = 1;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//000
		//020
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(2));
		assertThat(board[2][2], is(0));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(2,2)に置く
	 *
	 * 000
	 * 000
	 * 002
	 *
	 */
	@Test
	public void testBoard18() {

		//000
		//000
		//000
		int[][] board = new int[3][3];

		//プレイヤー2が(2,2)に置く
		int count = 1;
		int gyou = 2;
		int retu = 2;
		Sanmoku.count(count, gyou, retu, board);

		//000
		//000
		//002
		assertThat(board[0][0], is(0));
		assertThat(board[0][1], is(0));
		assertThat(board[0][2], is(0));
		assertThat(board[1][0], is(0));
		assertThat(board[1][1], is(0));
		assertThat(board[1][2], is(0));
		assertThat(board[2][0], is(0));
		assertThat(board[2][1], is(0));
		assertThat(board[2][2], is(2));
	}

}
