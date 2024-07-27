package com.hrutik.simpleWebApp.service;

import com.hrutik.simpleWebApp.model.Product;
import com.hrutik.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 80000),
//            new Product(102, "Samsung", 60000),
//            new Product(103, "Redmi", 20000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}