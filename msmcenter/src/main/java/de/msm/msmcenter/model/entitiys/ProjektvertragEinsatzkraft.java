package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="ProjektvertragEinsatzkraft", schema = "dbo")


public class ProjektvertragEinsatzkraft {
  @Id
  @Column(name="ProjektvertragEinsatzkraft_ID")
  private Integer Id;

  @Column(name="ProjektvertragEinsatzkraft_StundenAnzahl")
  private String StundenAnzahl;

  @Column(name="ProjektvertragEinsatzkraft_Stundensatz")
  private String Stundensatz;

  @Column(name="ProjektvertragRechnungskunde_ID")
  private Integer projektvertragRechnungskundeId;

  @Column(name="Einsatzkraft_ID")
  private Integer einsatzkraftId;

  @Column(name="Fläche_ID")
  private Integer flächeId;

  @Column(name="Tätigkeit_ID")
  private Integer tätigkeitId;

  @Column(name="MSMFirmen_ID")
  private Integer msmFirmenId;



}
