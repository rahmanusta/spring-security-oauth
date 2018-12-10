package test.app.com.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import test.app.com.entities.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
