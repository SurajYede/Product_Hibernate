package com.example.boot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.boot.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	List<Product>list=new ArrayList<>();
	public ProductDaoImpl() {
		
		list.add(new Product(1,"Mobile",10,"Electronic",10000));
		list.add(new Product(3,"LED",8,"Electronic",20000));
		list.add(new Product(2,"Printer",20,"Electronic",25000));
		list.add(new Product(5,"AC",5,"Electronic",30000));
		list.add(new Product(4,"Laptop",6,"Electronic",26000));
	}
	
	@Override
	public boolean saveProduct(Product product) {
		
		list.add(product);
		
		return true;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return list;
	}

	@Override
	public Product getProductById(int productId) {
		Product product=null;
		for (Product product1:list) {
			if (product1.getProductId()==productId) {
				product=product1;
				break;
			}
			}
		return product;
		}

	@Override
	public boolean deleteProduct(int productId) {
		boolean isDeleted=false;
		for (Product product:list) {
			if (product.getProductId()==productId) {
				list.remove(product);
				isDeleted=true;
				break;
			}
		}
		return isDeleted;
	}

	@Override
	public boolean updateProduct(Product product) {
	    boolean isUpdated=false;
	    for(Product product1:list) {
	    	if (product1.getProductId()==product.getProductId()) {
	    		list.set(list.indexOf(product1), product);
	    		isUpdated=true;
	    		break;
	    	}
	    }
		return false;
	}
	  
	}

