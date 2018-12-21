package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="freelancer_has_ArbeitsvertragEinsatzkraft", schema = "dbo")

public class FreelancerHasArbeitsvertragEinsatzkraft {
  @Id

  @Column(name="Freelancer_ID")
  private Integer freelancerId;

  @Column(name="ArbeitsvertragEinsatzkraft_ID")
  private Integer arbeitsvertragEinsatzkraftId;


}
