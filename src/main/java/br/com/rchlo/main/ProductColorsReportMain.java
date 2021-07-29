package br.com.rchlo.main;
import br.com.rchlo.data.ProductRepository;
import br.com.rchlo.domain.Color;
import br.com.rchlo.service.ProductByColorsReport;

import java.util.Map;
public class ProductColorsReportMain {

	public static void main(String[] args) {
		ProductByColorsReport service = new ProductByColorsReport();
        Map<Color, Long> report = service.report(ProductRepository.all());
	}

}
