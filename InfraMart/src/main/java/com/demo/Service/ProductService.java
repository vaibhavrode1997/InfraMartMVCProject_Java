package com.demo.Service;

import java.util.List;

import com.demo.Beans.Product;

public interface ProductService {

	List<Product> getProducts();

	void addProduct(Product product);

	void deleteById(int id);

	Product getById(int id);

	void updateProduct(Product product);

	
	

}
