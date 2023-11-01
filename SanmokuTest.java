package sannmoku2;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class SanmokuTest {
	// staticメソッドはオーバーライドできないため、RunGame:runGame()の呼び出しを変える必要がある
	//    // メソッドの呼び出し情報を格納するフラグ
	//    private static boolean runGameCalled = false;
	//
	//    // テストケースの前に実行されるセットアップ
	//    @BeforeClass
	//    public static void setUp() {
	//        // メソッドの呼び出し情報を初期化
	//        runGameCalled = false;
	//    }
	//
	//    // メソッドの呼び出しをキャッチするサブクラス
	//    static class MockRunGame extends RunGame {
	//        @Override
	//        public void runGame() {
	//            // メソッドが呼び出されたことを記録
	//            runGameCalled = true;
	//        }
	//    }
	//
	// /**
	// * runGameメソッド呼び出し
	// */
	// @Test
	// public void testRunGame() {
	// RunGame.runGame();
	//
	// }

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

	@Test
	public void determine2横上() {
		Sanmoku.board = new int[3][3];

		int count = 1;
		//プレイヤー2が(0,0)に置く
		Sanmoku.count(count, 0, 0, Sanmoku.board);
		//プレイヤー2が(1,1)に置く
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

	@Test
	public void determine引き分け() {
		Sanmoku.board = new int[3][3];

		int count = 0;
		int count2 = 1;
		//プレイヤー1
		Sanmoku.count(count, 0, 0, Sanmoku.board);
		//プレイヤー2
		Sanmoku.count(count2, 0, 1, Sanmoku.board);
		//プレイヤー1
		Sanmoku.count(count, 1, 1, Sanmoku.board);
		//プレイヤー2
		Sanmoku.count(count2, 2, 2, Sanmoku.board);
		//プレイヤー1
		Sanmoku.count(count, 1, 0, Sanmoku.board);
		//プレイヤー2
		Sanmoku.count(count2, 1, 2, Sanmoku.board);
		//プレイヤー1
		Sanmoku.count(count, 2, 1, Sanmoku.board);
		//プレイヤー2
		Sanmoku.count(count2, 2, 0, Sanmoku.board);
		//プレイヤー1
		Sanmoku.count(count, 0, 2, Sanmoku.board);
		//121
		//112
		//212
		assertThat(Sanmoku.determine(), is(3));
	}

	@Test
	public void determine0() {
		Sanmoku.board = new int[3][3];

		int count = 0;
		assertThat(Sanmoku.determine(), is(0));
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
		//Sanmoku.isValidMove(3, 3);
		assertThat(Sanmoku.isValidMove(3, 3), is(false));
		assertThat(Sanmoku.isValidMove(0, 3), is(false));
		assertThat(Sanmoku.isValidMove(3, 0), is(false));
		assertThat(Sanmoku.isValidMove(-3, 0), is(false));
		assertThat(Sanmoku.isValidMove(0, -5), is(false));

	}

	@Test
	public void isValidMoveout() {
		Sanmoku.board = new int[3][3];

		int count = 1;
		//プレイヤー2が(0,2)に置く
		Sanmoku.count(count, 0, 2, Sanmoku.board);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		Sanmoku.isValidMove(0, 2);
		assertThat(out.toString(), is("既に置かれている場所です。" + System.lineSeparator()));
	}

	@Test
	public void isValidMoveTrue() {

		//Sanmoku.isValidMove(0, 2);
		assertThat(Sanmoku.isValidMove(0, 2), is(true));
	}

	@Test
	public void out() {
		Sanmoku.board = new int[3][3];

		int count = 1;
		//プレイヤー2が(0,2)に置く
		Sanmoku.count(count, 0, 2, Sanmoku.board);

		Sanmoku.out();
	}

}