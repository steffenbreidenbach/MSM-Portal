package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Einsatzkraft;
import de.msm.msmcenter.model.entitiys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EinsatzkraftRepository extends JpaRepository<Einsatzkraft, Integer> {
    Optional<Einsatzkraft> findByid(int id);
    Optional<Einsatzkraft> findByUser(User user);
}
