package com.example.kokoroguruma.testjunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kokoroguruma on 2018/03/29.
 */
public class ZzzTest {

	Zzz zzz;

	// テスト実行時に最初に呼ばれるメソッド（@Before付きなので）
	@Before
	public void setUp() throws Exception {
		// メソッドのテスト用に
		// ここでクラスのオブジェクト化
		zzz = new Zzz("aaa");

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void zzz() throws Exception {

		assertNotNull(new Zzz("aaa"));
		assertNotNull(new Zzz("bbb"));

		// 例外発生のテスト
		try {
			new Zzz("ccc"); // 例外が発生する。はず。
			fail(); // これは実行されたら失敗（例外発生で本来は動かない）
		} catch (Exception e) {
			// まず、エラーのタイプが同じかどうか（↑のException e）
			// エラーメッセージの内容があってるかどうか
			assertTrue(e.getMessage().matches("ddd"));
		}

	}

	@Test
	public void mZzz1() throws Exception {
		assertEquals(zzz.mZzz1("aaa"), "111");
		assertEquals(zzz.mZzz1("bbb"), "222");
		assertEquals(zzz.mZzz1("ccc"), "");

	}

}