package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.MsmFirmen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface MsmFirmenRepository extends JpaRepository<MsmFirmen,Integer> {
    ArrayList<MsmFirmen> findAll();
}
