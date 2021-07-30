package br.com.rchlo.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.rchlo.domain.Color;
import br.com.rchlo.domain.Product;

public class ProductByColorsReport {

	private static Map<Color, Integer> colorsReport = new HashMap<Color, Integer>();
	public static void report(List<Product> productList) {

		if(productList == null) {
			throw new IllegalArgumentException("The list must be given and valid");
		}
		for(Color colorValue: Color.values()) {
			colorsReport.put(colorValue, 0);
		}
		for(Product product: productList)  {
			if(product.getColor() != null) {
				colorsReport.put(product.getColor(), colorsReport.get(product.getColor()) + 1);
			}
		}
		colorsReport.forEach((color,  numberOfProducts) -> System.out.println("Cor " + color + "Quantidade de produtos " + numberOfProducts));

	}

}