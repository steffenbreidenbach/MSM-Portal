package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

  @Column(name="MSMFirmen_ID")
  private Integer msmFirmenId;

  @Column(name="RechnungskundeDifferenzierung_ID")
  private Integer rechnungskundeDifferenzierungId;
}
