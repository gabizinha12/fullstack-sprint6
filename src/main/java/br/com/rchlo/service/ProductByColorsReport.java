package br.com.rchlo.service;
import java.util.List;

import br.com.rchlo.data.ProductRepository;
import br.com.rchlo.domain.Color;
import br.com.rchlo.domain.Product;

public class ProductByColorsReport {
	public static void main(String[] args) {
		ProductsByColor productsByColor = new ProductsByColor();
		List<Product> products = ProductRepository.all();
		List<Product> filteredProducts = productsByColor.filter(products, Color.WHITE);
		for (Product product : filteredProducts) {
            System.out.printf("%s - %s %n", product.getCode(), product.getName());

		}
	}
	


}
