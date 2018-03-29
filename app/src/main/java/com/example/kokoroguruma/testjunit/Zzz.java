package com.example.kokoroguruma.testjunit;

/**
 * Created by Kokoroguruma on 2018/03/29.
 */

public class Zzz {

	public Zzz(String str) throws Exception {
		if (str.equals("aaa")) {
			System.out.println("");
		} else if (str.equals("bbb")) {
			System.out.println("");
		} else {
			throw new Exception("ddd");
		}

	}


	public String mZzz1(String str) {
		if (str.equals("aaa")) {
			return "111";
		} else if (str.equals("bbb")) {
			return "222";
		} else {
			return "";
		}

	}

/*
	assertEquals(Zzz.Zzz("aaa"), "111");
	assertEquals(Zzz.Zzz("bbb"), "222");
	assertEquals(Zzz.Zzz("ccc"), "");
*/

}
