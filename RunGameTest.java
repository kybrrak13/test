package sannmoku2;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;

import org.junit.Test;

public class RunGameTest {
	@Test
	public void RunGame横上() {

		// テスト用の入力文字列を設定
		String input = "0\n0 1\n0 0\n1 1\n1 0\n2";
		/*
		* 111
		* 220
		* 000
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		assertDoesNotThrow(() -> RunGame.runGame());

		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}

	@Test
	public void RunGame横中() {

		// テスト用の入力文字列を設定
		String input = "0\n1 0\n0 1\n1 0\n2 1\n2 2\n0 1\n0";
		/*
		* 212
		* 111
		* 200
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		assertDoesNotThrow(() -> RunGame.runGame());

		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}

	@Test
	public void RunGame横下() {

		// テスト用の入力文字列を設定
		String input = "2\n0 0\n0 2\n1 0\n2 2\n2";
		/*
		* 202
		* 000
		* 111
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		assertDoesNotThrow(() -> RunGame.runGame());

		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}

	@Test
	public void RunGame縦左() {

		// テスト用の入力文字列を設定
		String input = "0\n0 0\n1 1\n0 0\n2 2\n0";
		/*
		* 122
		* 100
		* 100
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		assertDoesNotThrow(() -> RunGame.runGame());

		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}

	@Test
	public void RunGame縦中() {

		// テスト用の入力文字列を設定
		String input = "0\n1 0\n2 1\n1 1\n2 2\n1";
		/*
		* 012
		* 012
		* 010
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		assertDoesNotThrow(() -> RunGame.runGame());

		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}

	@Test
	public void RunGame縦右() {

		// テスト用の入力文字列を設定
		String input = "0\n2 0\n0 1\n2 1\n1 2\n2";
		/*
		* 201
		* 021
		* 001
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		assertDoesNotThrow(() -> RunGame.runGame());

		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}

	@Test
	public void RunGame右上がり() {

		// テスト用の入力文字列を設定
		String input = "1\n0 0\n0 0\n1 0\n2 2\n2 1\n1 1\n2 2\n0";
		/*
		* 212
		* 121
		* 201
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		assertDoesNotThrow(() -> RunGame.runGame());

		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}

	@Test
	public void RunGame右下がり() {
		// テスト用の入力文字列を設定
		String input = "0\n0 1\n0 1\n1 0\n1 2\n2";
		/*
		* 120
		* 210
		* 000
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		assertDoesNotThrow(() -> RunGame.runGame());

		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}

	@Test
	public void RunGame3() {
		// テスト用の入力文字列を設定
		String input = "a\ns";
		/*
		* 212
		* 121
		* 001
		*/
		InputStream inputStream = new ByteArrayInputStream(input.getBytes());

		// System.inを置き換えてテスト
		InputStream originalSystemIn = System.in;
		System.setIn(inputStream);

		// ゲームボードを初期化
		Sanmoku.board = new int[3][3];
		Sanmoku.count = 0;

		// メソッドを呼び出して例外が発生しないことを確認
		//assertDoesNotThrow(() -> RunGame.runGame());
		assertThrows(NoSuchElementException.class, () -> RunGame.runGame());
		// System.inを元に戻す
		System.setIn(originalSystemIn);

	}
}