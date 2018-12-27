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
  private String Einsatzzeit;

  @Column(name = "Besetzung_BestätigungEinsatzkraft")
  private String BestätigungEinsatzkraft;

  @Column(name = "Besetzung_Pausenzeit")
  private String Pausenzeit;


  @Column(name = "ProjektvertragRechnungskunde_ID")
  private Integer projektvertragRechnungskundeId;

  @Column(name = "Einsatzkraft_ID")
  private Integer einsatzkraftId;

  @OneToOne
  private Fläche Fläche;

  @Column(name = "Besetzung_BestätigungFürRechnung")
  private String BestätigungFürRechnung;

  @Column(name = "Besetzung_AnfrageVersendung")
  private String AnfrageVersendung;

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
