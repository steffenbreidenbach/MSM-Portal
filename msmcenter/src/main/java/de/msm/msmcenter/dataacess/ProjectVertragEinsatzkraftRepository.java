package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Einsatzkraft;
import de.msm.msmcenter.model.entitiys.Fläche;
import de.msm.msmcenter.model.entitiys.ProjektvertragEinsatzkraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ProjectVertragEinsatzkraftRepository extends JpaRepository<ProjektvertragEinsatzkraft,Integer> {
    ArrayList<ProjektvertragEinsatzkraft> findFlächeByEinsatzkraft(Einsatzkraft einsatzkraft);
}
