package com.example.boot.sort;

import java.util.Comparator;

import com.example.boot.model.Product;

public class ProductIdComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if (p1.getProductId()==p2.getProductId()) {
			return 0;
		}else if (p1.getProductId()>p2.getProductId()) {
			return 1;
		}else
		return -1;
	}

}
