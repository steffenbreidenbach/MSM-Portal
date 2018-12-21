package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Besetzung",schema="dbo")
public class Besetzung {

  @Id

  @Column(name = "ID")
  private Integer id;

  @Column(name = "Besetzung_Datum")
  private String Datum;

  @Column(name = "Besetzung_Einsatzzeit")
  private String Einsatzzeit;

  @Column(name = "Besetzung_BestätigungEinsatzkraft")
  private String BestätigungEinsatzkraft;

  @Column(name = "Besetzung_Pausenzeit")
  private String Pausenzeit;


  @Column(name = "ProjektvertragRechnungskunde_ID")
  private Integer projektvertragRechnungskundeId;

  @Column(name = "Einsatzkraft_ID")
  private Integer einsatzkraftId;

  @Column(name = "Fläche_ID")
  private Integer flächeId;


  @Column(name = "Besetzung_BestätigungFürRechnung")
  private String BestätigungFürRechnung;

  @Column(name = "Besetzung_AnfrageVersendung")
  private String AnfrageVersendung;

  @Column(name = "Besetzung_StartZeit")
  private java.sql.Timestamp besetzungStartZeit;

  @Column(name = "Besetzung_EndZeit")
  private java.sql.Timestamp besetzungEndZeit;
}
