package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="LeistungskundeAnsprechpartner", schema = "dbo")

public class LeistungskundeAnsprechpartner {
  @Id
  @Column(name="ID")
  private Integer id;

  @Column(name="LeistungskundeAnsprechpatner_Anrede")
  private String anrede;

  @Column(name="LeistungskundeAnsprechpatner_Vorname")
  private String vorname;

  @Column(name="LeistungskundeAnsprechpatner_Name")
  private String name;

  @Column(name="LeistungskundeAnsprechpatner_Telefon")
  private String telefon;

  @Column(name="LeistungskundeAnsprechpatner_eMail")
  private String eMail;

  @Column(name="LeistungskundeAnsprechpatner_BIld")
  private byte[] bild;

  @Column(name="LeistungskundeAnsprechpatner_Fax")
  private String fax;

  @Column(name="Leistungskunde_ID")
  private Integer leistungskundeId;

  @Column(name="User_ID")
  private Integer userId;



}
