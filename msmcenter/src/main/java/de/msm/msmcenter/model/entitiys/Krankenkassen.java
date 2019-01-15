package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Krankenkassen", schema = "dbo")

public class Krankenkassen {

  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="Krankenkassen_Name")
  private String name;

  @Column(name="Krankenkasse_Ort")
  private String ort;

  @Column(name="Krankenkasse_PLZ")
  private String plz;

  @Column(name="Krankenkasse_IBAN")
  private String iban;

  @Column(name="Krankenkassen_BIC")
  private String bic;

  @Column(name="Krankenkasse_SEPA")
  private short sepa;

  @Column(name="Krankenkasse_Bundesland")
  private String bundesland;

}
