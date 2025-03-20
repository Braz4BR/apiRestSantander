package exemple.first.santander_dev_exemple_2025.domain.repository;

import exemple.first.santander_dev_exemple_2025.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
