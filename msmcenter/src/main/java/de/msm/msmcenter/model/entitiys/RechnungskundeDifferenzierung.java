package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="RechnungskundeDifferenzierung", schema = "dbo")

public class RechnungskundeDifferenzierung {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="RechnungskundeDifferenzierung_Bezeichnung")
  private String rechnungskundeDifferenzierungBezeichnung;

  @OneToOne
  private Rechnungskunde rechnungskunde;



}
