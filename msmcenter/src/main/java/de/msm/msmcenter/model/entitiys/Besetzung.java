package de.msm.msmcenter.model.entitiys;


import lombok.Data;
import de.msm.msmcenter.model.entitiys.Fläche;
import javax.persistence.*;

@Data
@Entity
@Table(name="Besetzung",schema="dbo")
public class Besetzung {


  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name = "Besetzung_Einsatzzeit")
  private String einsatzzeit;

  @Column(name = "Besetzung_BestätigungEinsatzkraft")
  private String bestätigungEinsatzkraft;

  @Column(name = "Besetzung_Pausenzeit")
  private String pausenzeit;

  @OneToOne
  @JoinColumn(name = "ProjektvertragRechnungskunde_ID")
  private ProjektvertragRechnungskunde projektvertragRechnungskunde;

  @OneToOne
  @JoinColumn(name = "Einsatzkraft_ID")
  private Einsatzkraft einsatzkraft;

  @OneToOne
  private Fläche fläche;

  @Column(name = "Besetzung_BestätigungFürRechnung")
  private String bestätigungFürRechnung;

  @Column(name = "Besetzung_AnfrageVersendung")
  private String anfrageVersendung;

  @Column(name = "Besetzung_Start")
  private java.sql.Timestamp end;

  @Column(name = "Besetzung_End")
  private java.sql.Timestamp start;


  @Transient
  private String title ;

  @Transient
  private String description ;

  @Transient
  private String color ;


}
