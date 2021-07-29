package br.com.rchlo.service;

import br.com.rchlo.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductsByEffectivePriceRange {

    public List<Product> m(BigDecimal minimumPrice, BigDecimal maximumPrice, List<Product> list) {
        if (minimumPrice == null) throw new IllegalArgumentException("minimum price should not be null");
        if (maximumPrice == null) throw new IllegalArgumentException("maximum price should not be null");
        if (list == null) throw new IllegalArgumentException("product list should not be null");

        List<Product> filteredList = new ArrayList<>();

        for (Product product : list) {
           BigDecimal finalPrice =  getFinalPrice(product);
           if(finalPrice.compareTo(minimumPrice) >= 0 && finalPrice.compareTo(maximumPrice) <= 0) {
        	   filteredList.add(product);
           }
        }

        return filteredList;
    }
    private BigDecimal getFinalPrice(Product product) {
    	BigDecimal productDiscount = product.getDiscount();
    	BigDecimal productPrice = product.getPrice();
    	return productDiscount != null ? productPrice.subtract(productDiscount) : productPrice;
    }

}
