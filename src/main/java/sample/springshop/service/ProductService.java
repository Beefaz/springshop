package sample.springshop.service;

import sample.springshop.model.Products;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    default List<Products> getAllProducts() {
        return new ArrayList<>();
    }
}
