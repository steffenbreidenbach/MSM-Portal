package de.msm.msmcenter.model.entitiys;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="ArbeitsvertragEinsatzkraft",schema = "dbo")
public class ArbeitsvertragEinsatzkraft {

  @Id
  @Column(name = "ID")
  private int id;

  @Column(name="ArbeitsvertragEinsatzkraft_Eintrittsdatum")
  private String Eintrittsdatum;

  @Column(name="ArbeitsvertragEinsatzkraft_Austrittsdatum")
  private String Austrittsdatum;

  @Column(name="ArbeitsvertragEinsatzkraft_Urlaubsanspruch")
  private String Urlaubsanspruch;

  @Column(name="ArbeitsvertragEinsatzkraft_WöchentlicheArbeitszeit")
  private String WöchentlicheArbeitszeit;

  @Column(name="ArbeitsvertragEinsatzkraft_Arbeitsort")
  private String Arbeitsort;

  @Column(name="ArbeitsvertragEinsatzkraft_Eingruppierung")
  private String Eingruppierung;

  @Column(name="ArbeitsvertragEinsatzkraft_Grundlohn")
  private String Grundlohn;

  @Column(name="ArbeitsvertragEinsatzkraft_AT-Zulage")
  private String At_Zulage;

  @Column(name="ArbeitsvertragEinsatzkraft_Zulagen")
  private String Zulagen;

  @Column(name="ArbeitsvertragEinsatzkraft_VWL-Leistungen")
  private String _VWL_Leistungen;

  @Column(name="ArbeitsvertragEinsatzkraft_Gescannt")
  private String Gescannt;

  @Column(name="ArbeitsvertragEinsatzkraft_MitgliedsbescheinigungKrankenversicherung")
  private String MitgliedsbescheinigungKrankenversicherung;

  @Column(name="ArbeitsvertragEinsatzkraft_Sozialversicherungsausweis")
  private String Sozialversicherungsausweis;

  @Column(name="ArbeitsvertragEinsatzkraft_VertragVermögenswirksameLeistung")
  private String VertragVermögenswirksameLeistung;

  @Column(name="ArbeitsvertragEinsatzkraft_NachweisElterneigenschaft")
  private String NachweisElterneigenschaft;

  @Column(name="ArbeitsvertragEinsatzkraft_VertragBetrieblicheArbeitsversorgung")
  private String VertragBetrieblicheArbeitsversorgung;

  @Column(name="ArbeitsvertragEinsatzkraft_ArbeitszeugnisVorherigerArbeitgeber")
  private String ArbeitszeugnisVorherigerArbeitgeber;

  @Column(name="ArbeitsvertragEinsatzkraft_Urlaubsbescheinigung")
  private String Urlaubsbescheinigung;

  @Column(name="ArbeitsvertragEinsatzkraft_Zeitarbeitnehmer")
  private String Zeitarbeitnehmer;

  @Column(name="ArbeitsvertragEinsatzkraft_Probezeit")
  private String Probezeit;

  @Column(name="ArbeitsvertragEinsatzkraft_MonatlicheArbeitszeit")
  private String MonatlicheArbeitszeit;

  @Column(name="MItarbeiterVerfügbarkeit_ID")
  private String mItarbeiterVerfügbarkeitId;

  @Column(name="ArbeitsvertragEinsatzkraft_AnzahlSollTageWöchentlich")
  private String AnzahlSollTageWöchentlich;

  @Column(name="ArbeitsvertragEinsatzkraft_Stundenlohn")
  private String Stundenlohn;

  @Column(name="Tätigkeit_ID")
  private Integer tätigkeitId;

  @Column(name="Einsatzkraft_ID")
  private Integer einsatzkraftId;

  @Column(name="MSMFirmen_ID")
  private Integer msmFirmenId;

  @Column(name="Fläche_ID")
  private Integer flächeId;

}
