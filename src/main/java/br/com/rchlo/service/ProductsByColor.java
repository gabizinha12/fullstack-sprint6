package br.com.rchlo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rchlo.domain.Color;
import br.com.rchlo.domain.Product;

public class ProductsByColor {
	public List<Product> filter(List<Product> products, Color color) {
		if(color == null) {
			throw new NullPointerException("Par�metro 'color' � null");
		}
		if(products == null) {
			throw new NullPointerException("Par�metro 'products' � null");
		}
		if(products.size() == 0) {
			return new ArrayList<>();
		}
		return products.stream()
				.filter(product -> product.getColor().equals(color))
				.collect(Collectors.toList());
	}

}
