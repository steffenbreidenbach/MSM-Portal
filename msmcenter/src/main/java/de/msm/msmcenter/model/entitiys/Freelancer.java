package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

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

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="Einsatzkraft_ID")
  private Einsatzkraft einsatzkraft;

  @OneToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name="EinsatzkraftFirma_ID")
  private EinsatzkraftFirma einsatzkraftFirma;

}
