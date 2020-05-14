package sample.springshop.model;

import org.springframework.data.repository.CrudRepository;

public interface ProductsDAO extends CrudRepository<Products, Integer> {
}
