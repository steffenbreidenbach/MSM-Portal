package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="ArbeitsvertragEinsatzkraft_has_MitarbeiterVerfügbarkeiten",schema="dbo")
public class ArbeitsvertragEinsatzkraftHasMitarbeiterVerfügbarkeiten {
  @Id
  @Column(name="ArbeitsvertragEinsatzkraft_ArbeitsvertragEinsatzkraft_ID")
  private Integer arbeitsvertragEinsatzkraftId;

  @Column(name="MitarbeiterVerfügbarkeiten_ID")
  private Integer mitarbeiterVerfügbarkeitenId;

}
