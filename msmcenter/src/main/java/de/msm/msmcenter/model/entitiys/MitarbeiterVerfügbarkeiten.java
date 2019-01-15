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
  private String mo;

  @Column(name="MitarbeiterVerfügbarkeiten_Di")
  private String di;

  @Column(name="MitarbeiterVerfügbarkeiten_Miw")
  private String miw;

  @Column(name="MitarbeiterVerfügbarkeiten_Do")
  private String don;

  @Column(name="MitarbeiterVerfügbarkeiten_Fr")
  private String fr;

  @Column(name="MitarbeiterVerfügbarkeiten_Sa")
  private String sa;

  @Column(name="MitarbeiterVerfügbarkeiten_So")
  private String so;

  @Column(name="ArbeitsvertragEinsatzkraft_ID")
  private String arbeitsvertragEinsatzkraftId;


}
