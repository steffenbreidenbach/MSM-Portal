package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Leistungskunde;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeistungskundeRepository extends JpaRepository<Leistungskunde, Integer> {
    List<Leistungskunde> findByName(String name);
    List<Leistungskunde> findByNameContains(String name);
    List<Leistungskunde> findAll();

}
