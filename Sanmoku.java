package sannmoku;

import java.util.Scanner;

public class Sanmoku {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int gyou;
		int retu;
		int[][] board = new int[3][3];
		int count = 0;

		while (true) {
			for (int i = 0; i < board.length; i++) {
				for (int n = 0; n < board[i].length; n++) {
					System.out.print(board[i][n]);
				}
				System.out.println();
			}

			if (count % 2 == 1) {
				System.out.println("プレイヤー2");
			} else {
				System.out.println("プレイヤー1");
			}

			gyou = sc.nextInt();
			retu = sc.nextInt();

			if (count % 2 == 1) {
				board[gyou][retu] = (2);
			} else {
				board[gyou][retu] = (1);
			}
			count++;
		}
	}
}