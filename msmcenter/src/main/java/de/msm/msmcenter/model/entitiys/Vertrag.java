package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="vertrag", schema = "dbo")


public class Vertrag {
  @Id
  @Column(name="Vertrag_ID")
  private Integer vertragId;

  @Column(name="Fläche_Fläche_ID")
  private Integer flächeFlächeId;

  @Column(name="Fläche_RechnungskundeDifferenzierung_RechnungskundeDifferenzierung_ID")
  private Integer flächeRechnungskundeDifferenzierungRechnungskundeDifferenzierungId;

}
