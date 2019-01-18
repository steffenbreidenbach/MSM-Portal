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

  @OneToOne(cascade = {CascadeType.ALL})
  private RechnungskundeDifferenzierung rechnungskundeDifferenzierung;

  @OneToOne(cascade = {CascadeType.ALL})
  private Leistungskunde leistungskunde;

}
