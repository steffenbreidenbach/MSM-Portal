package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Einsatzkraft",schema="dbo")
public class Einsatzkraft {
  @Id
  @Column(name="ID")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;

  @Column(name="Einsatzkraft_Name")
  private String name;

  @Column(name="Einsatzkraft_Familienstand")
  private String Familienstand;

  @Column(name="Einsatzkraft_Geschlecht")
  private String Geschlecht;

  @Column(name="Einsatzkraft_Geburtsdatum")
  private String Geburtsdatum;

  @Column(name="Einsatzkraft_Geburtsland")
  private String Geburtsland;

  @Column(name="Einsatzkraft_Staatsangehörigkeit")
  private String Staatsangehörigkeit;

  @Column(name="Einsatzkraft_Herkunft")
  private String Herkunft;

  @Column(name="Einsatzkraft_Größe")
  private String Größe;

  @Column(name="Einsatzkraft_Haarfarbe")
  private String Haarfarbe;

  @Column(name="Einsatzkraft_Konfgröße1")
  private String Konfgröße1;

  @Column(name="Einsatzkraft_Konfgröße2")
  private String Konfgröße2;

  @Column(name="Einsatzkraft_Strasse")
  private String Strasse;

  @Column(name="Einsatzkraft_Hausnummer")
  private String Hausnummer;

  @Column(name="Einsatzkraft_Ort")
  private String Ort;

  @Column(name="Einsatzkraft_PLZ")
  private String Plz;

  @Column(name="Einsatzkraft_Telefon")
  private String Telefon;

  @Column(name="Einsatzkraft_MobilTel")
  private String MobilTel;

  @Column(name="Einsatzkraft_Fax")
  private String Fax;

  @Column(name="Einsatzkraft_EMail")
  private String EMail;

  @Column(name="Einsatzkraft_KontoInhaber")
  private String KontoInhaber;

  @Column(name="Einsatzkraft_IBAN")
  private String Iban;

  @Column(name="Einsatzkraft_Kreditinstitut")
  private String Kreditinstitut;

  @Column(name="Einsatzkraft_BIC")
  private String Bic;

  @Column(name="Einsatzkraft_Steuernummer")
  private String Steuernummer;

  @Column(name="Einsatzkraft_Geburtsort")
  private String Geburtsort;

  @Column(name="Einsatzkraft_Vorname")
  private String Vorname;

  @Column(name="Einsatzkraft_HöchsterSchulabschluss")
  private String HöchsterSchulabschluss;

  @Column(name="Einsatzkraft_HöchsteBerufsausbildung")
  private String HöchsteBerufsausbildung;

  @Column(name="Einsatzkraft_WöchentlicheArbeitszeit")
  private String WöchentlicheArbeitszeit;

  @OneToOne
  private User user;

  @Column(name="Einsatzkraft_AnzahlderKinder")
  private String AnzahlderKinder;

  @Column(name="Einsatzkraft_Status")
  private String Status;



}
