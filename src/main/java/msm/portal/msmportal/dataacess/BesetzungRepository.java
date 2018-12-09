package msm.portal.msmportal.dataacess;

import msm.portal.msmportal.model.Besetzung;
import msm.portal.msmportal.model.Einsatzkraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BesetzungRepository extends JpaRepository<Besetzung, Integer> {
    ArrayList<Besetzung> findAllByeinsatzkraftID(int id);
    List<Besetzung> findAll();

    List<Besetzung> findByStartDatumBetween(Date startDate, Date endDate);
}
