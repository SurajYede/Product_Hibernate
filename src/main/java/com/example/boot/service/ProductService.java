package com.example.boot.service;

import java.util.List;

import com.example.boot.model.Product;

public interface ProductService {

	  public boolean saveProduct(Product product);
	
      public List<Product>getAllProduct();
      
      public Product getProductById(int productId) ;
    	  
      public boolean  deleteProduct(int productId);
      
      public boolean updateProduct(Product product) ;
    	 
      public List<Product>sortProducts(String sortBy);
      
      public  Product getMaxPriceProducts();
      
      public double countSumOfProductsPrice();
      
      public int getTotalCountOfProducts();
      
    
      
      }
             
      
      

