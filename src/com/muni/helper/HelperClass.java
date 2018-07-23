package com.muni.helper;

import java.util.ArrayList;
import java.util.List;

import com.muni.Instrument;

public class HelperClass {
	public Instrument getInstrument() {
		Instrument entry = new Instrument();
		entry.setItems(getProducts(6));
		entry.setBeatInstId("35");
		return entry;
	}

	public List<Item> getProducts(int number) {
		List<Item> products = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			products.add(getProduct());
		}
		return products;
	}

	public Item getProduct() {
		Item product = new Item();
		product.setBrandName("MUNI");
		product.setPrice(getMoney());
		product.setProductCnt(6);
		product.setProductId("PRO-28764");
		return product;
	}

	public Money getMoney() {
		Money money = new Money();
		money.setAmount(200);
		money.setSymbol("$");
		return money;
	}

}
