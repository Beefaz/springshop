package sample.springshop.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sample.springshop.model.Users;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<Users, Integer> {
}
