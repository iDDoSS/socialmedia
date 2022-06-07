package kz.idos.socialmedia.repo;

import kz.idos.socialmedia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
