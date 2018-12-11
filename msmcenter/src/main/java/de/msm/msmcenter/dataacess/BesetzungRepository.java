package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.Besetzung;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public interface BesetzungRepository extends JpaRepository<Besetzung, Integer> {
    ArrayList<Besetzung> findAllByeinsatzkraftID(int id);
    List<Besetzung> findAll();

    List<Besetzung> findByStartBetween(Date startDate, Date endDate);
}
