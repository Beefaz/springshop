package sample.springshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sample.springshop.model.Products;
import sample.springshop.repository.ProductRepository;


@Controller
public class ProductsController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/store/products")
    public ModelAndView getAllProductsPage() {
        Iterable<Products> productsList = productRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("products");
        modelAndView.addObject("ListOfProducts", productsList);
        return modelAndView;
    }

    @GetMapping("/store/products/addproduct")
    public ModelAndView addProduct(Products products) {
        productRepository.save(products);
        return new ModelAndView("redirect:/store/products");
    }
}
