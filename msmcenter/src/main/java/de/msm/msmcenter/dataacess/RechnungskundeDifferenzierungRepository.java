package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Rechnungskunde;
import de.msm.msmcenter.model.entitiys.RechnungskundeDifferenzierung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RechnungskundeDifferenzierungRepository extends JpaRepository<RechnungskundeDifferenzierung,Integer> {
}
