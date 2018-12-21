package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="ProjektvertragRechnungskunde", schema = "dbo")

public class ProjektvertragRechnungskunde {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="ProjektvertragRechnungskunde_Stundensatz")
  private String Stundensatz;

  @Column(name="ProjektvertragRechnungskunde_Feedback")
  private String Feedback;

  @Column(name="ProjektvertragRechnungskunde_EingangsDatum")
  private String EingangsDatum;

  @Column(name="ProjektvertragRechnungskunde_Gescannt")
  private byte[] Gescannt;

  @Column(name="ProjektvertragRechnungskunde_ErstellungsDatum")
  private String ErstellungsDatum;

  @Column(name="RechnungskundeDifferenzierung_ID")
  private Integer rechnungskundeDifferenzierungId;

}
