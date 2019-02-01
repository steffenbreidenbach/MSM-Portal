package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Mitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MitarbeiterRepository extends JpaRepository<Mitarbeiter,Integer> {
}
