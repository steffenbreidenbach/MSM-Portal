package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Brauchen wir nicht mehr ?
@Data
@Entity
@Table(name="LeistungskundeAccount", schema = "dbo")


public class LeistungskundeAccount {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="LeistungskundeAccount_Bezeichnung")
  private String leistungskundeAccountBezeichnung;

  @Column(name="LeistungskundeAccount_Password")
  private String leistungskundeAccountPassword;

  @Column(name="Portalrechte")
  private String portalrechte;


}
