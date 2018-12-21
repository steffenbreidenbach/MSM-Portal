package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="RahmenvertragEinsatzkraft", schema = "dbo")

public class RahmenvertragEinsatzkraft {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name = "RahmenvertragEinsatzkraft_Prozzesstatus")
  private String rahmenvertragEinsatzkraftProzzesstatus;

  @Column(name = "MSMFirmen_ID")
  private Integer msmFirmenId;

  @Column(name="Einsatzkraft_ID")
  private Integer einsatzkraftId;
}
