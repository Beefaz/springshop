package sample.springshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.springshop.model.Products;
import sample.springshop.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List <Products> getAllProducts(){
        List <Products> productList = new ArrayList<>();
        Iterable<Products> iterator = productRepository.findAll();
        if (iterator != null){
            for (Products products : iterator){
                productList.add(products);
            }
        }
        return ProductService.super.getAllProducts();
    }
}
