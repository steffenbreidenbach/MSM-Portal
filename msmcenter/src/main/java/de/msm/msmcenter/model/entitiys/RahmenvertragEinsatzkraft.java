package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="RahmenvertragEinsatzkraft", schema = "dbo")

public class RahmenvertragEinsatzkraft {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name = "RahmenvertragEinsatzkraft_Prozzesstatus")
  private String rahmenvertragEinsatzkraftProzzesstatus;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name = "MSMFirmen_ID")
  private MsmFirmen msmFirmen;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="Einsatzkraft_ID")
  private Einsatzkraft einsatzkraft;
}
