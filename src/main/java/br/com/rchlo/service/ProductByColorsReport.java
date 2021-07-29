package br.com.rchlo.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import br.com.rchlo.domain.Color;
import br.com.rchlo.domain.Product;

public class ProductByColorsReport {
	public Map<Color, Long> report(List<Product> products) {
		if(products == null) {
			throw new NullPointerException("Parâmetro 'products' é null");
		}
		if(products.size() == 0) {
			return Collections.emptyMap();
		}
        Map<Color, Long> map = products.stream().collect(groupingBy(Product::getColor, counting())); 
        for (Color color : Color.values()) {
			map.putIfAbsent(color, 0L);
		}
        return map;

	}

}
