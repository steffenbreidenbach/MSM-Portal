
package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="MSMFirmen", schema = "dbo")



public class MsmFirmen {
  @Column(name="MSMFirmen_Bezeichnung")
  private String Bezeichnung;

  @Column(name="MSMFirmen_GeschäftsführerVorname")
  private String GeschäftsführerVorname;

  @Column(name="MSMFirmen_HandelsregisterNr")
  private String HandelsregisterNr;

  @Column(name="MSMFirmen_SteuerId")
  private String SteuerId;

  @Column(name="MSMFirmen_Registergericht")
  private String Registergericht;

  @Column(name="MSMFirmen_IBAN")
  private String Iban;

  @Column(name="MSMFirmen_BIC")
  private String Bic;

  @Column(name="MSMFirmen_Logo")
  private byte[] Logo;

  @Column(name="MSMFirmen_Strasse")
  private String Strasse;

  @Column(name="MSMFirmen_HausNr")
  private String HausNr;

  @Column(name="MSMFirmen_PLZ")
  private String Plz;

  @Column(name="MSMFirmen_Ort")
  private String Ort;

  @Column(name="MSMFirmen_GeschäftsführerAnrede")
  private String GeschäftsführerAnrede;

  @Column(name="MSMFirmen_GeschäftsführerNachname")
  private String GeschäftsführerNachname;

  @Column(name="MSMFirmen_Kreditinstitut")
  private String Kreditinstitut;

  @Column(name="MSMFirmen_EMail")
  private String EMail;

  @Column(name="MSMFirmen_Telefon")
  private String Telefon;

  @Id
  @Column(name="ID")
  private Integer id;

}
