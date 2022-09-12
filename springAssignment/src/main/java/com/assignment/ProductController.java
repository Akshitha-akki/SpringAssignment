package com.assignment;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	//ProductDetails
	@GetMapping("/ProductDetails")
	public List<Product> getProductDetails()
	{
		return ProductService.getProductDetails();
	}
	
	//AddDetails
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product pro)
	{
		return ProductService.addProduct(pro);
	}
	
	//SearchProduct
	@GetMapping("/ProductId/{productId}")
	public Product getProductDetailsById(@PathVariable int productId)
	{
		return ProductService.getProductById(productId);
	}
	
	//UpdateProduct
	@PutMapping("/updateProduct/{productId}")
	public Product updateProduct(@PathVariable int productId ,@RequestBody Product pro)
	{
		return ProductService.updateProductDetails(productId, pro);
	}
	
	//DeleteProduct
	@DeleteMapping("/removeProduct/{productId}")
	public Product removeProduct(@PathVariable int productId)
	{
		return ProductService.removeCollege(productId);
	}
}
