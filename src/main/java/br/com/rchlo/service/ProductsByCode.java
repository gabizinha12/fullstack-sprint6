package br.com.rchlo.service;

import br.com.rchlo.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsByCode {

    public List<Product> filter(Long code, List<Product> products) {
        validateParameters(code, products);

        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (code.equals(product.getCode())) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    private void validateParameters(Long code, List<Product> products) {
        if (code == null) throw new IllegalArgumentException("code should not be null");
        if (products == null) throw new IllegalArgumentException("product list should not be null");
    }

}
