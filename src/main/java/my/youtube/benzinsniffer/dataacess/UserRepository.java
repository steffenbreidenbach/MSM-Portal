package my.youtube.benzinsniffer.dataacess;

import my.youtube.benzinsniffer.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    Optional<User> findByid(int id);
}
