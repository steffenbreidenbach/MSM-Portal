package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Fläche", schema = "dbo")

public class Fläche {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="Fläche_Name")
  private String flächeName;

  @Column(name="RechnungskundeDifferenzierung_ID")
  private Integer rechnungskundeDifferenzierungId;


  @Column(name="Leistungskunde_ID")
  private Integer leistungskundeId;

}
