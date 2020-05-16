package sample.springshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sample.springshop.model.Products;
import sample.springshop.repository.ProductRepository;

import java.util.List;

@Controller
public class ProductsController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public ModelAndView getAllProductsPage() {
        Iterable<Products> productsList = productRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("store/products.jsp");
        modelAndView.addObject("ListOfProducts", productsList);
        System.out.println(modelAndView.toString());
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
