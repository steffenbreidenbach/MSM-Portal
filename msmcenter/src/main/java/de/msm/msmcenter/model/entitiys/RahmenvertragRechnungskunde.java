package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="RahmenvertragRechnungskunde", schema = "dbo")

public class RahmenvertragRechnungskunde {
  @Id
  private Integer id;
  @Column(name="RahmenvertragRechnungskunde_ErstellungsDatum")
  private String erstellungsDatum;

  @Column(name="RahmenvertragRechnungskunde_UnterzeichnenderAnsprechpartner")
  private String unterzeichnenderAnsprechpartner;

  @Column(name="RahmenvertragRechnungskunde_Gescannt")
  private String gescannt;

  @Column(name="RahmenvertragRechnungskunde_EingangsDatum")
  private String eingangsDatum;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="MSMFirmen_ID")
  private MsmFirmen msmFirmen;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="RechnungskundeDifferenzierung_ID")
  private RechnungskundeDifferenzierung rechnungskundeDifferenzierung;
}
