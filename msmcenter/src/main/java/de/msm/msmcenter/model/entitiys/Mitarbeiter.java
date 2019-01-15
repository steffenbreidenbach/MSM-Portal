package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Mitarbeiter", schema = "dbo")


public class Mitarbeiter {
  @Id
  @Column(name="Einsatzkraft_VersicherungsNr")
  private String sersicherungsNr;

  @Column(name="Einsatzkraft_Schwerbehindert")
  private String schwerbehindert;

  @Column(name="Einsatzkraft_WöchentlicheArbeitszeit")
  private String wöchentlicheArbeitszeit;

  @Column(name="User_ID")
  private String userId;

  @Column(name="ID")
  private Integer id;
  @Column(name="Einsatzkraft_ID")

  private Integer Id;

  @OneToOne
  @JoinColumn(name="Krankenkassen_ID")
  private Krankenkassen krankenkassen;



}
