package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Mitarbeiter", schema = "dbo")


public class Mitarbeiter {
  @Id
  @Column(name="Einsatzkraft_VersicherungsNr")
  private String VersicherungsNr;

  @Column(name="Einsatzkraft_Schwerbehindert")
  private String Schwerbehindert;

  @Column(name="Einsatzkraft_WöchentlicheArbeitszeit")
  private String WöchentlicheArbeitszeit;

  @Column(name="User_ID")
  private String userId;

  @Column(name="ID")
  private Integer id;
  @Column(name="Einsatzkraft_ID")

  private Integer Id;

  @Column(name="Krankenkassen_ID")
  private Integer krankenkassenId;



}
