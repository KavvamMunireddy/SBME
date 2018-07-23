package com.muni;

public class Muni {
	public static void main(String[] args) {
		Item item = new Item();
		item.setReferenceInstId("DN-201712262A452F9D");
		if (InstrumentType.DN.name().equals(item.getReferenceInstId().substring(0, 3))) {
			System.out.println(item.getReferenceInstId().substring(0, 2));
		} else {
			System.out.println("substring not working");
		}
	}

}
