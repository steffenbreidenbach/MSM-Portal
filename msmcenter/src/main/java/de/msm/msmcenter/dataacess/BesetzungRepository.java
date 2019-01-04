package de.msm.msmcenter.dataacess;


import de.msm.msmcenter.model.entitiys.Besetzung;
import de.msm.msmcenter.model.entitiys.Fläche;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public interface BesetzungRepository extends JpaRepository<Besetzung, Integer> {
    ArrayList<Besetzung> findAllByeinsatzkraftId(int id);
    List<Besetzung> findAll();
    //List<Besetzung> findAllByEinsatzkraftIdAndStartGreaterThanAndEndLessThan(int id,Date start,Date end);
    List<Besetzung> findBystartBetween(Date start, Date end);
    List<Besetzung> findAllByFlächeIdAndStartGreaterThanAndEndLessThan(int id,Date start,Date end);
}
