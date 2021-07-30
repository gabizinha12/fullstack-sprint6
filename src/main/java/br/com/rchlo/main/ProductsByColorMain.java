package br.com.rchlo.main;

import java.util.List;

import br.com.rchlo.data.ProductRepository;
import br.com.rchlo.domain.Color;
import br.com.rchlo.domain.Product;
import br.com.rchlo.service.ProductsByColor;

public class ProductsByColorMain {
	public static void main(String[] args) {
		   ProductsByColor productsByColor = new ProductsByColor();
	        List<Product> allProducts = ProductRepository.all();

	        List<Product> filteredProducts = productsByColor.filter(allProducts, Color.WHITE);

	        for (Product product : filteredProducts) {
	            System.out.printf("%s - %s %n", product.getCode(), product.getName());
	        }
	}
}
