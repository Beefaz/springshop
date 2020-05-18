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
        ModelAndView modelAndView = new ModelAndView("redirect:/store/products");
        return modelAndView;
    }
    /*@GetMapping("/store/products")
    public ModelAndView addProduct() {
        return modelAndView;
    }


    /*
    @GetMapping("/")
    public ModelAndView getProductPage(){
        Iterable<Products> listOfProducts= productsDAO.findAll();
        for (Products products : listOfProducts){
            System.out.println(products);
        }
        return new ModelAndView("index");
    }
    @GetMapping("/products")
    public String loaddashboard() { return "products.jsp"; }

    @GetMapping("/products/{productId}")
    public String getAllProductsByProductId(@PathVariable int productId) {
        return productsDAO.findById(productId).toString();
    }

    @GetMapping("/products/{productName}")
    public String getAllProductsByProductName(@PathVariable String productName) {
        return productsDAO.findAllByProductNameIsContaining(productName).toString();
    }
    */
}
