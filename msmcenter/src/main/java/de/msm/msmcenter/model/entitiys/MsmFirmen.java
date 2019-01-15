
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
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="MSMFirmen_Bezeichnung")
  private String bezeichnung;

  @Column(name="MSMFirmen_GeschäftsführerVorname")
  private String geschäftsführerVorname;

  @Column(name="MSMFirmen_HandelsregisterNr")
  private String handelsregisterNr;

  @Column(name="MSMFirmen_SteuerId")
  private String steuerId;

  @Column(name="MSMFirmen_Registergericht")
  private String registergericht;

  @Column(name="MSMFirmen_IBAN")
  private String iban;

  @Column(name="MSMFirmen_BIC")
  private String bic;

  @Column(name="MSMFirmen_Logo")
  private byte[] logo;

  @Column(name="MSMFirmen_Strasse")
  private String strasse;

  @Column(name="MSMFirmen_HausNr")
  private String hausNr;

  @Column(name="MSMFirmen_PLZ")
  private String plz;

  @Column(name="MSMFirmen_Ort")
  private String ort;

  @Column(name="MSMFirmen_GeschäftsführerAnrede")
  private String geschäftsführerAnrede;

  @Column(name="MSMFirmen_GeschäftsführerNachname")
  private String geschäftsführerNachname;

  @Column(name="MSMFirmen_Kreditinstitut")
  private String kreditinstitut;

  @Column(name="MSMFirmen_EMail")
  private String eMail;

  @Column(name="MSMFirmen_Telefon")
  private String telefon;



}
