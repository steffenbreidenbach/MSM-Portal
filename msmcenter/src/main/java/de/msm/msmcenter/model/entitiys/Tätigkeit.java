package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Tätigkeit", schema = "dbo")


public class Tätigkeit {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="Tätigkeit_Beschreibung")
  private String tätigkeitBeschreibung;

  @Column(name="Tätigkeit_Titel")
  private String tätigkeitTitel;



}
