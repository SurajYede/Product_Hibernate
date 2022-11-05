package com.example.boot.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.dao.ProductDao;
import com.example.boot.model.Product;
import com.example.boot.sort.ProductIdComparator;
import com.example.boot.sort.ProductNameComparator;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;
	
	@Override
	public boolean saveProduct(Product product) {
		
	boolean isAdded=dao.saveProduct(product);
	
		return isAdded;
	}

	@Override
	public List<Product> getAllProduct() {
		
		List<Product>list= dao.getAllProduct();
		
		return list;
	}

	@Override
	public Product getProductById(int productId) {
	
		Product product= dao.getProductById(productId);
		return product;
	}

	@Override
	public boolean deleteProduct(int productId) {
	boolean isDeleted=	dao.deleteProduct(productId);
		return isDeleted;
	}

	@Override
	public boolean updateProduct(Product product) {
		boolean isUpdated=dao.updateProduct(product);
		return isUpdated;
	}

	@Override
	public List<Product> sortProducts(String sortBy) {
		
		List<Product>list=getAllProduct();
		if (sortBy.equalsIgnoreCase("ProductName")) {
		
		Collections.sort(list,new ProductNameComparator());
		Collections.reverse(list);
		}
		else if (sortBy.equalsIgnoreCase("ProductId")){
			Collections.sort(list,new ProductIdComparator());
		}
		return list;
	}

	@Override
	public Product getMaxPriceProducts() {
       List<Product>allproduct=getAllProduct();
      Product product= allproduct.stream().max(Comparator.comparingDouble(Product::getProductPrice)).get();
		return product;
	}

	@Override
	public double countSumOfProductsPrice() {
		List<Product>allproduct=getAllProduct();
		double sum=allproduct.stream().mapToDouble(Product::getProductPrice).sum();
		return sum;
	}

	@Override
	public int getTotalCountOfProducts() {
        List<Product>allproduct=getAllProduct();
		return allproduct.size();
	}
	
	
}
