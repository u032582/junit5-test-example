package com.example.junittest;

/**
 * このクラスには、商品名と価格をフィールドとして持ち、消費税を計算するメソッド(`calculateTax`)があります。`calculateTax`メソッドは、フィールドに設定された価格に応じてif文を利用して消費税を計算し、その結果を返します。消費税の率は、価格が100未満の場合は8%、100以上500未満の場合は10%、500以上の場合は15%に設定されています。
 * @author u0325
 *
 */
public class TaxCalculator {
	private int price;

	public TaxCalculator(int price) {
		this.price = price;
	}

	public int calculateTax() {
		int tax;
		if (price < 100) {
			tax = 8;
		} else if (price < 500) {
			tax = 10;
		} else {
			tax = 15;
		}
		return price * tax / 100;
	}

}
