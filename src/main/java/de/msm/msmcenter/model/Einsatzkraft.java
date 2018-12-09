package de.msm.msmcenter.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Einsatzkraft" , schema="dbo")
public class Einsatzkraft {
    public Einsatzkraft(Einsatzkraft einsatzkraft){

    }

    public Einsatzkraft(){

    }

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Einsatzkraft_Firmennummer")
    private String firmennummer;

    @Column(name = "Einsatzkraft_Name")
    private String name;

    @Column(name = "Einsatzkraft_Familienstand")
    private String familienstand;

    @Column(name = "Einsatzkraft_Geschlecht")
    private String geschlecht;

    @Column(name = "Einsatzkraft_Geburtsdatum")
    private String geburtsdatum;

    @Column(name = "Einsatzkraft_Geburtsland")
    private String geburtsland;

    @Column(name = "Einsatzkraft_VersicherungsNr")
    private String versicherungsnr;

    @Column(name = "Einsatzkraft_Schwerbehindert")
    private String schwerbehindert;

    @Column(name = "Einsatzkraft_Staatsangehörigkeit")
    private String staatsangehörigkeit;

    @Column(name = "Einsatzkraft_Herkunft")
    private String herkunft;

    @Column(name = "Einsatzkraft_Größe")
    private String groeße;

    @Column(name = "Einsatzkraft_Haarfarbe")
    private String haarfarbe;

    @Column(name = "Einsatzkraft_Konfgröße1")
    private String konfgroeße1;

    @Column(name = "Einsatzkraft_Konfgröße2")
    private String konfgroeße2;

    @Column(name = "Einsatzkraft_Bemerkung")
    private String bemerkung;

    @Column(name = "Einsatzkraft_Strasse")
    private String strasse;

    @Column(name = "Einsatzkraft_Hausnummer")
    private String hausnummer;

    @Column(name = "Einsatzkraft_Ort")
    private String ort;

    @Column(name = "Einsatzkraft_PLZ")
    private String plz;

    @Column(name = "Einsatzkraft_Telefon")
    private String telefon;

    @Column(name = "Einsatzkraft_mobilTelefon")
    private String mobilTele;

    @Column(name = "Einsatzkraft_Fax")
    private String fax;

    @Column(name = "Einsatzkraft_eMail")
    private String eMail;

    @Column(name = "Einsatzkraft_Kontoinhaber")
    private String kontoinhaber;

    @Column(name = "Einsatzkraft_IBAN")
    private String iban;

    @Column(name = "Einsatzkraft_Kreditinstitut")
    private String kreditinstitut;

    @Column(name = "Einsatzkraft_BIC")
    private String bic;

    @Column(name = "Einsatzkraft_Steuernummer")
    private String steuernummer;

    @Column(name = "Einsatzkraft_MwSt")
    private String mwst;

    @Column(name = "Einsatzkraft_Geburtsort")
    private String geburtsort;

    @Column(name = "Einsatzkraft_Vorname")
    private String vorname;

    @Column(name = "Einsatzkraft_AnzahlderKinder")
    private String anzahlderkinder;

    @Column(name = "Einsatzkraft_Krankenkasse")
    private String krankenkasse;

    @Column(name = "Einsatzkraft_HöchsterSchulabschluss")
    private String hoechsterschulanbschluss;

    @Column(name = "Einsatzkraft_HöchsteBerufsausbildung")
    private String hoechsteBerufsAusbildung;


    @Column(name = "Einsatzkraft_WöchentlicheArbeitszeit")
    private String woechentlicheArbeitsZeit;

    @Column(name = "Einsatzkraft_Status")
    private String status;

    @Column(name = "EinsatzkraftFirma_ID")
    private int einsatzkraftFirmaID;

    @Column(name = "user_username")
    private String user_username;
}
