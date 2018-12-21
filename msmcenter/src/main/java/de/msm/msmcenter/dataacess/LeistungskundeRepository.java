package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Leistungskunde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeistungskundeRepository extends JpaRepository<Leistungskunde, Integer> {
}
