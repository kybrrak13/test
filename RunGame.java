package sannmoku2;

import java.util.Scanner;

public class RunGame {

	public static void runGame() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			Sanmoku.out();

			if (Sanmoku.count % 2 == 1) {
				System.out.println("プレイヤー2：数値0～2を縦に二回入力して下さい。");
			} else {
				System.out.println("プレイヤー1：数値0～2を縦に二回入力して下さい。");
			}

			do {
				while (true) {

					try {
						Sanmoku.gyou = sc.nextInt();
						Sanmoku.retu = sc.nextInt();

						// isDigit()を使用し数値かどうかを判定する方法もある、その場合isValidMove()の入力チェック不要
						if (Sanmoku.gyou >= 0 && Sanmoku.retu >= 0) {
							// 入力のループを抜ける
							break;
						} else {
							// 数値以外の値を入力時は再入力させるように続ける
							continue;
						}

					} catch (Exception e) {
						System.out.println("入力をやり直して下さい。");
						sc.nextLine();
						// 初期化しないと前回の値が残りつづけることで、無限ループになる
						sc = new Scanner(System.in);
					}
				}
			} while (!Sanmoku.isValidMove(Sanmoku.gyou, Sanmoku.retu));

			Sanmoku.count = Sanmoku.count(Sanmoku.count, Sanmoku.gyou, Sanmoku.retu, Sanmoku.board);

			if (Sanmoku.board[0][0] != 0 && Sanmoku.board[0][1] == Sanmoku.board[0][0]
					&& Sanmoku.board[0][2] == Sanmoku.board[0][0]) {
				Sanmoku.out();
				/*
				* 111
				* 000
				* 000
				*/
				break;
			} else if (Sanmoku.board[1][0] != 0 && Sanmoku.board[1][1] == Sanmoku.board[1][0]
					&& Sanmoku.board[1][2] == Sanmoku.board[1][0]) {
				Sanmoku.out();
				/*
				* 000
				* 111
				* 000
				*/
				break;
			} else if (Sanmoku.board[2][0] != 0 && Sanmoku.board[2][0] == Sanmoku.board[2][1]
					&& Sanmoku.board[2][0] == Sanmoku.board[2][2]) {
				Sanmoku.out();
				/*
				* 000
				* 000
				* 111
				*/
				break;
			} else if (Sanmoku.board[0][0] != 0 && Sanmoku.board[0][0] == Sanmoku.board[1][0]
					&& Sanmoku.board[0][0] == Sanmoku.board[2][0]) {
				Sanmoku.out();
				/*
				* 100
				* 100
				* 100
				*/
				break;
			} else if (Sanmoku.board[0][1] != 0 && Sanmoku.board[0][1] == Sanmoku.board[1][1]
					&& Sanmoku.board[0][1] == Sanmoku.board[2][1]) {
				Sanmoku.out();
				/*
				* 010
				* 010
				* 010
				*/
				break;
			} else if (Sanmoku.board[0][2] != 0 && Sanmoku.board[0][2] == Sanmoku.board[1][2]
					&& Sanmoku.board[0][2] == Sanmoku.board[2][2]) {
				Sanmoku.out();
				/*
				* 001
				* 001
				* 001
				*/
				break;
			} else if (Sanmoku.board[0][0] != 0 && Sanmoku.board[0][0] == Sanmoku.board[1][1]
					&& Sanmoku.board[0][0] == Sanmoku.board[2][2]) {
				Sanmoku.out();
				/*
				* 100
				* 010
				* 001
				*/
				break;
			} else if (Sanmoku.board[0][2] != 0 && Sanmoku.board[0][2] == Sanmoku.board[1][1]
					&& Sanmoku.board[0][2] == Sanmoku.board[2][0]) {
				/*
				* 002
				* 020
				* 200
				*/
				Sanmoku.out();
				break;
			}

		}
		Sanmoku.winner = Sanmoku.determine();
		System.out.println("勝者" + Sanmoku.winner);
	}
}
