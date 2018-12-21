package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="EinsatzkraftFirma", schema = "dbo")

public class EinsatzkraftFirma {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="Namen")
  private String name;

  @Column(name="Ort")
  private String ort;

  @Column(name="PLZ")
  private String plz;

  @Column(name="Strasse")
  private String strasse;

  @Column(name="Hausnummer")
  private String hausnummer;

  @Column(name="SteuerID")
  private String steuerId;

  @Column(name="Geschäftsführer")
  private String geschäftsführer;


}