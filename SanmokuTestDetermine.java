package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import sannmoku.Sanmoku;

public class SanmokuTestDetermine {
	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(0,0)(0,1)(0,2)に置く
	 *
	 * 222
	 * 000
	 * 000
	 *
	 */
	@Test
	public void determine横上() {
		Sanmoku.board = new int[3][3];

		int count = 1;
		//プレイヤー2が(0,0)に置く
		Sanmoku.count(count, 0, 0, Sanmoku.board);
		//プレイヤー2が(0,1)に置く
		Sanmoku.count(count, 0, 1, Sanmoku.board);
		//プレイヤー2が(0,2)に置く
		Sanmoku.count(count, 0, 2, Sanmoku.board);

		//222
		//000
		//000
		assertThat(Sanmoku.determine(), is(2));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(1,0)(1,1)(1,2)に置く
	 *
	 * 000
	 * 222
	 * 000
	 *
	 */
	@Test
	public void determine横中() {
		Sanmoku.board = new int[3][3];

		int count = 1;
		//プレイヤー2が(1,0)に置く
		Sanmoku.count(count, 1, 0, Sanmoku.board);
		//プレイヤー2が(1,1)に置く
		Sanmoku.count(count, 1, 1, Sanmoku.board);
		//プレイヤー2が(1,2)に置く
		Sanmoku.count(count, 1, 2, Sanmoku.board);

		//000
		//222
		//000
		assertThat(Sanmoku.determine(), is(2));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(2,0)(2,1)(2,2)に置く
	 *
	 * 000
	 * 000
	 * 222
	 *
	 */
	@Test
	public void determine横下() {
		Sanmoku.board = new int[3][3];

		int count = 1;
		//プレイヤー2が(2,0)に置く
		Sanmoku.count(count, 2, 0, Sanmoku.board);
		//プレイヤー2が(2,1)に置く
		Sanmoku.count(count, 2, 1, Sanmoku.board);
		//プレイヤー2が(2,2)に置く
		Sanmoku.count(count, 2, 2, Sanmoku.board);

		//000
		//000
		//222
		assertThat(Sanmoku.determine(), is(2));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(0,0)(1,0)(2,0)に置く
	 *
	 * 100
	 * 100
	 * 100
	 *
	 */
	@Test
	public void determine縦左() {
		Sanmoku.board = new int[3][3];

		int count = 0;
		//プレイヤー1が(0,0)に置く
		Sanmoku.count(count, 0, 0, Sanmoku.board);
		//プレイヤー1が(1,0)に置く
		Sanmoku.count(count, 1, 0, Sanmoku.board);
		//プレイヤー1が(2,0)に置く
		Sanmoku.count(count, 2, 0, Sanmoku.board);

		//100
		//100
		//100
		assertThat(Sanmoku.determine(), is(1));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(0,1)(1,1)(2,1)に置く
	 *
	 * 010
	 * 010
	 * 010
	 *
	 */
	@Test
	public void determine縦中() {
		Sanmoku.board = new int[3][3];

		int count = 0;
		//プレイヤー1が(0,1)に置く
		Sanmoku.count(count, 0, 1, Sanmoku.board);
		//プレイヤー1が(1,1)に置く
		Sanmoku.count(count, 1, 1, Sanmoku.board);
		//プレイヤー1が(2,1)に置く
		Sanmoku.count(count, 2, 1, Sanmoku.board);

		//010
		//010
		//010
		assertThat(Sanmoku.determine(), is(1));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(0,2)(1,2)(2,2)に置く
	 *
	 * 001
	 * 001
	 * 001
	 *
	 */
	@Test
	public void determine縦右() {
		Sanmoku.board = new int[3][3];

		int count = 0;
		//プレイヤー1が(0,2)に置く
		Sanmoku.count(count, 0, 2, Sanmoku.board);
		//プレイヤー1が(1,2)に置く
		Sanmoku.count(count, 1, 2, Sanmoku.board);
		//プレイヤー1が(2,2)に置く
		Sanmoku.count(count, 2, 2, Sanmoku.board);

		//001
		//001
		//001
		assertThat(Sanmoku.determine(), is(1));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー1が(0,0)(1,1)(2,2)に置く
	 *
	 * 100
	 * 010
	 * 001
	 *
	 */
	@Test
	public void determine右下がり() {
		Sanmoku.board = new int[3][3];

		int count = 0;
		//プレイヤー1が(0,0)に置く
		Sanmoku.count(count, 0, 0, Sanmoku.board);
		//プレイヤー1が(1,1)に置く
		Sanmoku.count(count, 1, 1, Sanmoku.board);
		//プレイヤー1が(2,2)に置く
		Sanmoku.count(count, 2, 2, Sanmoku.board);

		//100
		//010
		//001
		assertThat(Sanmoku.determine(), is(1));
	}

	/**
	 * 000
	 * 000
	 * 000
	 *
	 * プレイヤー2が(0,2)(1,1)(2,0)に置く
	 *
	 * 002
	 * 020
	 * 200
	 *
	 */
	@Test
	public void determine右上がり() {
		Sanmoku.board = new int[3][3];

		int count = 1;
		//プレイヤー2が(0,2)に置く
		Sanmoku.count(count, 0, 2, Sanmoku.board);
		//プレイヤー2が(1,1)に置く
		Sanmoku.count(count, 1, 1, Sanmoku.board);
		//プレイヤー2が(2,0)に置く
		Sanmoku.count(count, 2, 0, Sanmoku.board);

		//002
		//020
		//200
		assertThat(Sanmoku.determine(), is(2));
	}

	/**
	 * 0～2以外の数値を入力
	 */
	@Test
	public void isValidMoveInput() {
		Sanmoku.isValidMove(3, 3);
		assertThat(Sanmoku.isValidMove(3, 3), is(false));
	}
}
