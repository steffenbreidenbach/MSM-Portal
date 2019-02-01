package de.msm.msmcenter.dataacess;

import de.msm.msmcenter.model.entitiys.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<Freelancer,Integer> {
}
