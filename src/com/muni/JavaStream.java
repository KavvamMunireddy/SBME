package com.muni;

import java.util.stream.Collectors;

import com.muni.helper.HelperClass;

public class JavaStream {
	public static void main(String[] args) {
		HelperClass helper = new HelperClass();
		UpdateOrderValueEntry orderValueEntry = new UpdateOrderValueEntry();
		Instrument entry = helper.getInstrument();
		orderValueEntry.setProducts(entry.getItems().stream().map(item -> {
			Product products = new Product();
			products.setPrice(item.getPrice().getAmount());
			return products;

		}).collect(Collectors.toList()));
		System.out.println(orderValueEntry.getProducts().size());
	}
}
