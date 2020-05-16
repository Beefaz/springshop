package sample.springshop.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UsersDAO extends CrudRepository<Users, Long> {
    Users findByUserName(String userName);
}
