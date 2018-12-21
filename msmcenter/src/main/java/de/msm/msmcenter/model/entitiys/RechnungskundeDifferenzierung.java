package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="RechnungskundeDifferenzierung", schema = "dbo")

public class RechnungskundeDifferenzierung {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="RechnungskundeDifferenzierung_Bezeichnung")
  private String rechnungskundeDifferenzierungBezeichnung;

  @Column(name="Rechnungskunde_ID")
  private Integer rechnungskundeId;



}
