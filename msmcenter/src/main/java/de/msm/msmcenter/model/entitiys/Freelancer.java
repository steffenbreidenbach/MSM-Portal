package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Freelancer", schema = "dbo")

public class Freelancer {


  @Column(name="Freelancer_MwST")
  private String freelancerMwSt;

  @Column(name="Freelancer_ID")
  private Integer freelancerId;

  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="Einsatzkraft_ID")
  private Integer einsatzkraftId;

  @Column(name="EinsatzkraftFirma_ID")
  private Integer einsatzkraftFirmaId;

}
