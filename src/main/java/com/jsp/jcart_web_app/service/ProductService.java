package com.jsp.jcart_web_app.service;

import com.jsp.jcart_web_app.dao.ProductDao;
import com.jsp.jcart_web_app.dto.Product;

public class ProductService {

	ProductDao dao = new ProductDao();
	
	public Product saveProductService(Product product) {
		return dao.saveProductDao(product);
	}
}
