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

  @Column(name="HandelspartnerAnsprechpatner_Anrede")
  private String Anrede;

  @Column(name="HandelspartnerAnsprechpatner_Vorname")
  private String Vorname;

  @Column(name="HandelspartnerAnsprechpatner_Name")
  private String Name;

  @Column(name="HandelspartnerAnsprechpatner_Telefon")
  private String Telefon;

  @Column(name="HandelspartnerAnsprechpatner_eMail")
  private String EMail;

  @Column(name="HandelspartnerAnsprechpatner_BIld")
  private byte[] BIld;

  @Column(name="HandelspartnerAnsprechpatner_Fax")
  private String Fax;

  @Column(name="Leistungskunde_ID")
  private Integer leistungskundeId;

  @Column(name="User_ID")
  private Integer userId;



}
