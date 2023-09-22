package com.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Beans.Product;
import com.demo.Dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Override
	public List<Product> getProducts() {
		
		return productDao.findAll();
	}

	@Override
	public void addProduct(Product product) {
		
		productDao.save(product);
	}

	@Override
	public void deleteById(int id) {
		productDao.deleteById(id);;
		
	}

	@Override
	public Product getById(int id) {
		
		Optional<Product> op=productDao.findById(id);
		
		return op.orElse(null);
	}

	@Override
	public void updateProduct(Product product) {
		
		Optional<Product> op=productDao.findById(product.getId());
		if(op.isPresent()) {
			Product p=op.get();
			p.setName(product.getName());
			p.setQty(product.getQty());
			p.setPrice(product.getPrice());
			p.setCategory(product.getCategory());
			p.setDescription(product.getDescription());
			productDao.save(p);		
		}
	
	}
	

	
	
}
