package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

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

  @OneToOne
  @JoinColumn(name="ProjektvertragRechnungskunde_ID")
  private ProjektvertragRechnungskunde projektvertragRechnungskunde;

  @OneToOne
  @JoinColumn(name="Einsatzkraft_ID")
  private Einsatzkraft einsatzkraft;

  @OneToOne
  @JoinColumn(name="Fläche_ID")
  private Fläche fläche;

  @OneToOne
  @JoinColumn(name="Tätigkeit_ID")
  private Tätigkeit tätigkeit;

  @OneToOne
  @JoinColumn(name="MSMFirmen_ID")
  private MsmFirmen msmFirmen;



}
