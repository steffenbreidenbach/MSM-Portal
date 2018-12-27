package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Rechnungskunde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RechnungskundeRepository extends JpaRepository<Rechnungskunde,Integer> {
}
