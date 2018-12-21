package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Flächenbesetzung_has_Einsatzkraft", schema = "dbo")

public class FlächenbesetzungHasEinsatzkraft {

  @Column(name="Flächenbesetzung_Flächenbesetzungs_ID")
  private Integer flächenbesetzungFlächenbesetzungsId;


  @Column(name="Einsatzkraft_Einsatzkraft_ID")
  @Id
  private Integer einsatzkraftEinsatzkraftId;

}
