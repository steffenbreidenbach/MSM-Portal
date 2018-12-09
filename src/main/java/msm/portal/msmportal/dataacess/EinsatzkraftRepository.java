package msm.portal.msmportal.dataacess;


import msm.portal.msmportal.model.Einsatzkraft;
import msm.portal.msmportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EinsatzkraftRepository extends JpaRepository<Einsatzkraft, Integer> {
    Optional<Einsatzkraft> findByid(int id);

}
