package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Rechnungskunde", schema = "dbo")

public class Rechnungskunde {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="Rechnungskunde_Name")
  private String name;

  @Column(name="Rechnungskunde_KontoInhaber")
  private String kontoInhaber;

  @Column(name="Rechnungskunde_IBAN")
  private String iban;

  @Column(name="Rechnungskunde_BIC")
  private String bic;

  @Column(name="Rechnungskunde_Kreditinstitut")
  private String kreditinstitut;

  @Column(name="Rechnungskunde_Strasse")
  private String strasse;

  @Column(name="Rechnugskunde_Hausnummer")
  private String hausnummer;

  @Column(name="Rechnungskunde_PLZ")
  private String plz;

  @Column(name="Rechnungskunde_Ort")
  private String ort;

  @Column(name="Rechnungskunde_Vertreter1")
  private String vertreter1;

  @Column(name="Rechnungskunde_Marke")
  private String marke;

  @Column(name="Rechnungskunde_Telefon")
  private String telefon;

  @Column(name="Rechnungskunde_Status")
  private String status;

}
