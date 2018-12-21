package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Leistungskunde", schema = "dbo")

public class Leistungskunde {
  @Id
  @Column(name="ID")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;

  @Column(name="Leistungskunde_name")
  private String name;

  @Column(name="Leistungskunde_Abteilung")
  private String abteilung;

  @Column(name="Leistungskunde_Strasse")
  private String strasse;

  @Column(name="Leistungskunde_Hausnummer")
  private String hausnummer;

  @Column(name="Leistungskunde_Ort")
  private String ort;

  @Column(name="Leistungskunde_PLZ")
  private String plz;

  @Column(name="Leistungskunde_eMail")
  private String eMail;

  @Column(name="Leistungskunde_Telefonnummer")
  private String telefonnummer;

}
