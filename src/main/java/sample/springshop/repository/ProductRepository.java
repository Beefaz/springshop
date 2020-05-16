package sample.springshop.repository;

import org.springframework.data.repository.CrudRepository;
import sample.springshop.model.Products;

public interface ProductRepository extends CrudRepository<Products, Integer> {
}
