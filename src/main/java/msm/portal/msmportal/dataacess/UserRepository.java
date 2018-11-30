package msm.portal.msmportal.dataacess;


import msm.portal.msmportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findBylogin(String username);

}
