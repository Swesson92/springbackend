package robin.springsite.robins.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import robin.springsite.robins.model.DAOUser;


@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
