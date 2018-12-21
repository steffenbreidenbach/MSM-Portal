package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Rechnungskunde", schema = "dbo")

public class Rechnungskunde {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="Rechnungskunde_Name")
  private String Name;

  @Column(name="Rechnungskunde_KontoInhaber")
  private String KontoInhaber;

  @Column(name="Rechnungskunde_IBAN")
  private String Iban;

  @Column(name="Rechnungskunde_BIC")
  private String Bic;

  @Column(name="Rechnungskunde_Kreditinstitut")
  private String Kreditinstitut;

  @Column(name="Rechnungskunde_Strasse")
  private String Strasse;

  @Column(name="Rechnugskunde_Hausnummer")
  private String rechnugskundeHausnummer;

  @Column(name="Rechnungskunde_PLZ")
  private String Plz;

  @Column(name="Rechnungskunde_Ort")
  private String Ort;

  @Column(name="Rechnungskunde_Vertreter1")
  private String Vertreter1;

  @Column(name="Rechnungskunde_Marke")
  private String Marke;

  @Column(name="Rechnungskunde_Telefon")
  private String Telefon;

  @Column(name="Rechnungskunde_Status")
  private String Status;

}
