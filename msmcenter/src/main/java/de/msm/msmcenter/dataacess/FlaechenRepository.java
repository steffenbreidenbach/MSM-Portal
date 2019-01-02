package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Fläche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlaechenRepository extends JpaRepository<Fläche, Integer> {
}
