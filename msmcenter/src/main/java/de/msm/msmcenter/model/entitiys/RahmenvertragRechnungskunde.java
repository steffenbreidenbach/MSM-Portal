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
  private String ErstellungsDatum;

  @Column(name="RahmenvertragRechnungskunde_UnterzeichnenderAnsprechpartner")
  private String UnterzeichnenderAnsprechpartner;

  @Column(name="RahmenvertragRechnungskunde_Gescannt")
  private String Gescannt;

  @Column(name="RahmenvertragRechnungskunde_EingangsDatum")
  private String EingangsDatum;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="MSMFirmen_ID")
  private MsmFirmen msmFirmen;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="RechnungskundeDifferenzierung_ID")
  private RechnungskundeDifferenzierung rechnungskundeDifferenzierung;
}
