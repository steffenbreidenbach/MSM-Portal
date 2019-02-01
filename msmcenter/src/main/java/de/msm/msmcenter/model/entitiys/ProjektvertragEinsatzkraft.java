package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ProjektvertragEinsatzkraft", schema = "dbo")


public class ProjektvertragEinsatzkraft {
  @Id
  @Column(name="ProjektvertragEinsatzkraft_ID")
  private Integer id;

  @Column(name="ProjektvertragEinsatzkraft_StundenAnzahl")
  private String stundenAnzahl;

  @Column(name="ProjektvertragEinsatzkraft_Stundensatz")
  private String stundensatz;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="ProjektvertragRechnungskunde_ID")
  private ProjektvertragRechnungskunde projektvertragRechnungskunde;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="Einsatzkraft_ID")
  private Einsatzkraft einsatzkraft;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="Fläche_ID")
  private Fläche fläche;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="Tätigkeit_ID")
  private Tätigkeit tätigkeit;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="MSMFirmen_ID")
  private MsmFirmen msmFirmen;



}
