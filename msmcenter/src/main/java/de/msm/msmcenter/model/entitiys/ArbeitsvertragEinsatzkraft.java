package de.msm.msmcenter.model.entitiys;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ArbeitsvertragEinsatzkraft",schema = "dbo")
public class ArbeitsvertragEinsatzkraft {

  @Id
  @Column(name = "ID")
  private int id;

  @Column(name="ArbeitsvertragEinsatzkraft_Eintrittsdatum")
  private String eintrittsdatum;

  @Column(name="ArbeitsvertragEinsatzkraft_Austrittsdatum")
  private String austrittsdatum;

  @Column(name="ArbeitsvertragEinsatzkraft_Urlaubsanspruch")
  private String urlaubsanspruch;

  @Column(name="ArbeitsvertragEinsatzkraft_WöchentlicheArbeitszeit")
  private String wöchentlicheArbeitszeit;

  @Column(name="ArbeitsvertragEinsatzkraft_Arbeitsort")
  private String arbeitsort;

  @Column(name="ArbeitsvertragEinsatzkraft_Eingruppierung")
  private String eingruppierung;

  @Column(name="ArbeitsvertragEinsatzkraft_Grundlohn")
  private String grundlohn;

  @Column(name="ArbeitsvertragEinsatzkraft_AT-Zulage")
  private String at_Zulage;

  @Column(name="ArbeitsvertragEinsatzkraft_Zulagen")
  private String zulagen;

  @Column(name="ArbeitsvertragEinsatzkraft_VWL-Leistungen")
  private String vwlLeistungen;

  @Column(name="ArbeitsvertragEinsatzkraft_Gescannt")
  private String gescannt;

  @Column(name="ArbeitsvertragEinsatzkraft_MitgliedsbescheinigungKrankenversicherung")
  private String mitgliedsbescheinigungKrankenversicherung;

  @Column(name="ArbeitsvertragEinsatzkraft_Sozialversicherungsausweis")
  private String sozialversicherungsausweis;

  @Column(name="ArbeitsvertragEinsatzkraft_VertragVermögenswirksameLeistung")
  private String vertragVermögenswirksameLeistung;

  @Column(name="ArbeitsvertragEinsatzkraft_NachweisElterneigenschaft")
  private String nachweisElterneigenschaft;

  @Column(name="ArbeitsvertragEinsatzkraft_VertragBetrieblicheArbeitsversorgung")
  private String vertragBetrieblicheArbeitsversorgung;

  @Column(name="ArbeitsvertragEinsatzkraft_ArbeitszeugnisVorherigerArbeitgeber")
  private String arbeitszeugnisVorherigerArbeitgeber;

  @Column(name="ArbeitsvertragEinsatzkraft_Urlaubsbescheinigung")
  private String urlaubsbescheinigung;

  @Column(name="ArbeitsvertragEinsatzkraft_Zeitarbeitnehmer")
  private String zeitarbeitnehmer;

  @Column(name="ArbeitsvertragEinsatzkraft_Probezeit")
  private String probezeit;

  @Column(name="ArbeitsvertragEinsatzkraft_MonatlicheArbeitszeit")
  private String monatlicheArbeitszeit;

  @Column(name="MItarbeiterVerfügbarkeit_ID")
  private String mitarbeiterVerfügbarkeitId;

  @Column(name="ArbeitsvertragEinsatzkraft_AnzahlSollTageWöchentlich")
  private String anzahlSollTageWöchentlich;

  @Column(name="ArbeitsvertragEinsatzkraft_Stundenlohn")
  private String stundenlohn;

  @OneToOne
  @JoinColumn(name="Tätigkeit_ID")
  private Tätigkeit tätigkeit;

  @OneToOne
  @JoinColumn(name="Einsatzkraft_ID")
  private Einsatzkraft einsatzkraft;

  @OneToOne
  @JoinColumn(name="MSMFirmen_ID")
  private MsmFirmen msmFirmen;

  @OneToOne
  @JoinColumn(name="Fläche_ID")
  private Fläche fläche;

}
