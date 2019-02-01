package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Krankenkassen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KrankenkassenRepository extends JpaRepository<Krankenkassen,Integer> {
}
