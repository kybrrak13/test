package sannmoku2;

public class Sanmoku {
	static int gyou;
	static int retu;
	static int[][] board = new int[3][3];
	static int count = 0;
	static int winner = 0;

	public static void main(String[] args) {
		RunGame.runGame();
	}

	/**
	*
	* @param count 偶数の場合、プレイヤー1 奇数の場合、プレイヤー2
	* @param gyou
	* @param retu
	* @param board
	* @return count+1
	*/
	static int count(int count, int gyou, int retu, int[][] board) {
		if (count % 2 == 1) {
			board[gyou][retu] = (2);
		} else {
			board[gyou][retu] = (1);
		}
		//return 1;
		count++;

		return count;
	}

	/**
	* 盤面の表示
	*/
	static void out() {
		for (int i = 0; i < board.length; i++) {
			for (int n = 0; n < board[i].length; n++) {
				System.out.print(board[i][n]);
			}
			System.out.println();
		}
	}

	/**
	* 勝敗判定を行う
	* @return 勝者1or2 引き分け3
	*/
	static int determine() {
		for (int i = 0; i < 3; i++) {
			// 横、縦
			if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
				return board[i][0];
			}
			if (board[0][i] != 0 && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
				return board[0][i];
			}
		}

		// 対角線のチェック
		if (board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			return board[0][0];
		}
		if (board[0][2] != 0 && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			return board[0][2];
		}

		// 引き分け
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == 0)
					return 0;
			}
		}

		return 3;
	}

	/**
	* 入力値と重複のチェック
	* @param gyou
	* @param retu
	* @return
	*/
	static boolean isValidMove(int gyou, int retu) {
		if (gyou < 0 || gyou > 2 || retu < 0 || retu > 2) {
			System.out.println("0～2の値を入力してください。");
			return false;
		}
		if (board[gyou][retu] != 0) {
			System.out.println("既に置かれている場所です。");
			return false;
		}
		return true;
	}
}
