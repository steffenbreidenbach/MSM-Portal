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
  private String familienstand;

  @Column(name="Einsatzkraft_Geschlecht")
  private String geschlecht;

  @Column(name="Einsatzkraft_Geburtsdatum")
  private String geburtsdatum;

  @Column(name="Einsatzkraft_Geburtsland")
  private String geburtsland;

  @Column(name="Einsatzkraft_Staatsangehörigkeit")
  private String staatsangehörigkeit;

  @Column(name="Einsatzkraft_Herkunft")
  private String herkunft;

  @Column(name="Einsatzkraft_Größe")
  private String größe;

  @Column(name="Einsatzkraft_Haarfarbe")
  private String haarfarbe;

  @Column(name="Einsatzkraft_Konfgröße1")
  private String konfgröße1;

  @Column(name="Einsatzkraft_Konfgröße2")
  private String konfgröße2;

  @Column(name="Einsatzkraft_Strasse")
  private String strasse;

  @Column(name="Einsatzkraft_Hausnummer")
  private String hausnummer;

  @Column(name="Einsatzkraft_Ort")
  private String ort;

  @Column(name="Einsatzkraft_PLZ")
  private String plz;

  @Column(name="Einsatzkraft_Telefon")
  private String telefon;

  @Column(name="Einsatzkraft_MobilTel")
  private String mobilTel;

  @Column(name="Einsatzkraft_Fax")
  private String fax;

  @Column(name="Einsatzkraft_EMail")
  private String eMail;

  @Column(name="Einsatzkraft_KontoInhaber")
  private String kontoInhaber;

  @Column(name="Einsatzkraft_IBAN")
  private String iban;

  @Column(name="Einsatzkraft_Kreditinstitut")
  private String kreditinstitut;

  @Column(name="Einsatzkraft_BIC")
  private String bic;

  @Column(name="Einsatzkraft_Steuernummer")
  private String steuernummer;

  @Column(name="Einsatzkraft_Geburtsort")
  private String geburtsort;

  @Column(name="Einsatzkraft_Vorname")
  private String vorname;

  @Column(name="Einsatzkraft_HöchsterSchulabschluss")
  private String höchsterSchulabschluss;

  @Column(name="Einsatzkraft_HöchsteBerufsausbildung")
  private String höchsteBerufsausbildung;

  @Column(name="Einsatzkraft_WöchentlicheArbeitszeit")
  private String wöchentlicheArbeitszeit;

  @OneToOne
  private User user;

  @Column(name="Einsatzkraft_AnzahlderKinder")
  private String anzahlderKinder;

  @Column(name="Einsatzkraft_Status")
  private String status;



}
