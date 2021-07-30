package br.com.rchlo.main;

import br.com.rchlo.data.ProductRepository;
import br.com.rchlo.service.ProductByColorsReport;

public class ProductByColorsReportMain {

	public static void main(String[] args) {
		ProductByColorsReport.report(ProductRepository.all());
	}

}
