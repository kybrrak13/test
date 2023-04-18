package sannmoku;

import java.util.Scanner;

public class Sanmoku {
	static int gyou;
	static int retu;
	public static int[][] board = new int[3][3];
	static int count = 0;
	static int winner = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			out();

			if (count % 2 == 1) {
				System.out.println("プレイヤー2：数値0～2を縦に二回入力して下さい。");
			} else {
				System.out.println("プレイヤー1：数値0～2を縦に二回入力して下さい。");
			}

			do {
				while (true) {

					try {
						gyou = sc.nextInt();
						retu = sc.nextInt();

						// isDigit()を使用し数値かどうかを判定する方法もある、その場合isValidMove()の入力チェック不要
						if (gyou >= 0 && retu >= 0) {
							// 入力のループを抜ける
							break;
						} else {
							// 数値以外の値を入力時は再入力させるように続ける
							continue;
						}

					} catch (Exception e) {
						System.out.println("入力をやり直して下さい。");
						// 初期化しないと前回の値が残りつづけることで、無限ループになる
						sc = new Scanner(System.in);
					}
				}
			} while (!isValidMove(gyou, retu));

			count = count(count, gyou, retu, board);

			if (board[0][0] != 0 && board[0][1] == board[0][0] && board[0][2] == board[0][0]) {
				out();
				break;
			} else if (board[0][0] != 0 && board[0][1] == board[0][0] && board[0][2] == board[0][0]) {
				out();
				break;
			} else if (board[1][0] != 0 && board[1][1] == board[1][0] && board[1][2] == board[1][0]) {
				out();
				break;
			} else if (board[0][0] != 0 && board[0][0] == board[1][0] && board[0][0] == board[1][0]) {
				out();
				break;
			} else if (board[1][0] != 0 && board[1][1] == board[1][0] && board[1][2] == board[1][0]) {
				out();
				break;
			} else if (board[0][1] != 0 && board[1][1] == board[0][1] && board[2][1] == board[0][1]) {
				out();
				break;
			} else if (board[0][2] != 0 && board[1][2] == board[0][2] && board[2][2] == board[0][2]) {
				out();
				break;
			} else if (board[0][0] != 0 && board[1][1] == board[0][0] && board[2][2] == board[0][0]) {
				out();
				break;
			} else if (board[0][2] != 0 && board[1][1] == board[0][2] && board[0][2] == board[0][2]) {
				out();
				break;
			}

		}
		winner = determine();
		System.out.println("勝者" + winner);
	}

	/**
	 *
	 * @param count 偶数の場合、プレイヤー1 奇数の場合、プレイヤー2
	 * @param gyou
	 * @param retu
	 * @param board
	 * @return count+1
	 */
	public static int count(int count, int gyou, int retu, int[][] board) {
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
	public static void out() {
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
	public static int determine() {
		// 横上
		if (board[0][0] != 0 && board[0][1] == board[0][0] && board[0][2] == board[0][0]) {
			return board[0][0];
		}
		// 横中
		if (board[1][0] != 0 && board[1][1] == board[1][0] && board[1][2] == board[1][0]) {
			return board[1][0];
		}
		// 横下
		if (board[2][0] != 0 && board[2][1] == board[2][0] && board[2][2] == board[2][0]) {
			return board[2][0];
		}
		// 縦左
		if (board[0][0] != 0 && board[0][0] == board[1][0] && board[2][0] == board[0][0]) {
			return board[0][0];
		}
		// 縦中
		if (board[0][1] != 0 && board[1][1] == board[0][1] && board[2][1] == board[0][1]) {
			return board[0][1];
		}
		// 縦右
		if (board[0][2] != 0 && board[1][2] == board[0][2] && board[2][2] == board[0][2]) {
			return board[0][2];
		}
		// 右下がり
		if (board[0][0] != 0 && board[1][1] == board[0][0] && board[2][2] == board[0][0]) {
			return board[0][0];
		}
		// 右上がり
		if (board[0][2] != 0 && board[1][1] == board[0][2] && board[2][0] == board[0][2]) {
			return board[0][2];
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[0][0] == 0)
					return 0;
			}
		}
		// 引き分け
		return 3;

	}

	/**
	 * 入力値と重複のチェック
	 * @param gyou
	 * @param retu
	 * @return
	 */
	public static boolean isValidMove(int gyou, int retu) {
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
