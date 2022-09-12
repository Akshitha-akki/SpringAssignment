package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductService 
{
	private static Map<Integer,Product> product = new HashMap();
	private static int index =1;
	
	static
	{
		   Product p1 =  new Product(1,"Samsung Galaxy",85000,"Electronic",50);
		   
		   product.put(1, p1);
	}
	
	public static List<Product> getProductDetails()
	{
		return new ArrayList<Product>(product.values());
	}
	
	//Add
		public static Product addProduct(Product pro)
		{
			index+=1;
			pro.setProductId(index);
			product.put(index,pro);
			
			return pro;
		}
		
	//Search
		public static Product getProductById(int productId)
		{
			return product.get(productId);
		}
	
	//Update
		public static Product updateProductDetails(int productId,Product pro)
		{
			pro.setProductId(productId);
			product.put(productId, pro);
			
			return pro;
		}
		
	//Delete
		public static Product removeCollege(int productId)
		{
			return product.remove(productId);
		}
}
