package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.Beans.Product;
import com.demo.Service.ProductService;



@Controller
@RequestMapping("/product")
public class ProductController {
 	@Autowired
	ProductService productService;
	
	@GetMapping("/getProductAdmin")
	public ModelAndView getProductsAdmin()
	{
		
		List<Product> plist=productService.getProducts();
		
		return new ModelAndView("admin","plist",plist);		
	}
	
	
	@GetMapping("/getProductUser")
	public ModelAndView getproductsUser()
	{
		List<Product> plist=productService.getProducts();
		
		return new ModelAndView("products","plist",plist);		
	}
	
	
	@GetMapping("/products")
	public String show()
	{
		return "productDetails";
	}
	
	
	@PostMapping("/addProduct")
	public ModelAndView addProducts(@RequestParam("name") String name, @RequestParam("qty") int qty,
			@RequestParam("price") double price, @RequestParam("category") String category,
			@RequestParam("description") String description)
	{
		
		Product product=new Product(name,qty,price,description,category);
		productService.addProduct(product);
		return new ModelAndView("redirect:/product/getProductAdmin");
	}
	
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteProducts(@PathVariable int id)
	{	
		productService.deleteById(id);
		return new ModelAndView("redirect:/product/getProductAdmin");
	}
  	
	
	@GetMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable int id)
	{
		System.out.println("in edit");
		Product product=productService.getById(id); 
		
		return new ModelAndView("updateProduct","product",product);
	}
	
	
	@PostMapping("/update")
	public ModelAndView updateProduct(@RequestParam("name") String name, @RequestParam("qty") int qty,
			@RequestParam("price") double price, @RequestParam("category") String category,
			@RequestParam("description") String description,@RequestParam("id") int id)
	{
		System.out.println("In update");
		
		Product product=new Product(id,name,qty,price,description,category);
		productService.updateProduct(product);
		return new ModelAndView("redirect:/product/getProductAdmin");
	}
	
	
	
}
