package com.example.junittest;

import java.util.ArrayList;

public class StringManipulator {
	/**
	 * 文字列を逆順にするメソッド
	 * 
	 * @param 文字列
	 * @return 逆順文字列
	 */
	public String reverse(String input) {
		if (input == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(input);
		return sb.reverse().toString();
	}

	/**
	 * 文字列に指定した文字が何回出現するか数えるメソッド
	 * 
	 * @param 文字列
	 * @param 指定した文字
	 * @return 出現回数
	 */
	public int countChar(String input, char c) {
		if (input == null) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 文字列を指定した区切り文字で分割して配列にするメソッド
	 * 
	 * @param 文字列
	 * @param 区切り文字
	 * @return 配列
	 */
	public String[] split(String input, char delimiter) {
		if (input == null) {
			return null;
		}
		ArrayList<String> list = new ArrayList<>();
		int start = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == delimiter) {
				list.add(input.substring(start, i));
				start = i + 1;
			}
		}
		list.add(input.substring(start));
		return list.toArray(new String[list.size()]);
	}
}
