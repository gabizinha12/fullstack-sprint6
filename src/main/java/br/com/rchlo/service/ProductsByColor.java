package br.com.rchlo.service;

import br.com.rchlo.domain.Color;
import br.com.rchlo.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsByColor {
    public List<Product> filter(List<Product> productList, Color color) {
        this.validateParameters(productList, color);

        List<Product> filteredProducts = new ArrayList<>();

        for (Product product : productList) {
            if (color == product.getColor()) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    private void validateParameters(List<Product> productList, Color color) {
        if (color == null) throw new IllegalArgumentException("color should not be null");

        if (productList == null) throw new IllegalArgumentException("product list should not be null");
    }
}