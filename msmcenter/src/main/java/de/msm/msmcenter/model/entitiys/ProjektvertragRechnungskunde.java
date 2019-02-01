package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ProjektvertragRechnungskunde", schema = "dbo")

public class ProjektvertragRechnungskunde {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="ProjektvertragRechnungskunde_Stundensatz")
  private String stundensatz;

  @Column(name="ProjektvertragRechnungskunde_Feedback")
  private String feedback;

  @Column(name="ProjektvertragRechnungskunde_EingangsDatum")
  private String eingangsDatum;

  @Column(name="ProjektvertragRechnungskunde_Gescannt")
  private byte[] gescannt;

  @Column(name="ProjektvertragRechnungskunde_ErstellungsDatum")
  private String erstellungsDatum;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="RechnungskundeDifferenzierung_ID")
  private RechnungskundeDifferenzierung rechnungskundeDifferenzierungId;

}
