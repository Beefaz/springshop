package sample.springshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sample.springshop.model.Products;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<Products, Integer> {
}
