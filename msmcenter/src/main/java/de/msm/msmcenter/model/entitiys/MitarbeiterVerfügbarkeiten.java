package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="MitarbeiterVerfügbarkeiten", schema = "dbo")


public class MitarbeiterVerfügbarkeiten {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="MitarbeiterVerfügbarkeiten_Mo")
  private String Mo;

  @Column(name="MitarbeiterVerfügbarkeiten_Di")
  private String Di;

  @Column(name="MitarbeiterVerfügbarkeiten_Miw")
  private String Miw;

  @Column(name="MitarbeiterVerfügbarkeiten_Do")
  private String Do;

  @Column(name="MitarbeiterVerfügbarkeiten_Fr")
  private String Fr;

  @Column(name="MitarbeiterVerfügbarkeiten_Sa")
  private String Sa;

  @Column(name="MitarbeiterVerfügbarkeiten_So")
  private String So;

  @Column(name="ArbeitsvertragEinsatzkraft_ID")
  private String arbeitsvertragEinsatzkraftId;


}
