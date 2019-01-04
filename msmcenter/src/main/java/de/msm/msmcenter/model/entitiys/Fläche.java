package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Fläche", schema = "dbo")

public class Fläche {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="Fläche_Name")
  private String flächeName;

  @OneToOne
  private RechnungskundeDifferenzierung rechnungskundeDifferenzierung;

  @OneToOne
  private Leistungskunde leistungskunde;

}
