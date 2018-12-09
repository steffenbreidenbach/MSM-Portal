package msm.portal.msmportal.model;

import lombok.Data;

import javax.persistence.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Besetzung" , schema="dbo")
public class Besetzung {
    public Besetzung(Besetzung besetzung){

    }

    public Besetzung(){

    }
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Besetzung_datum")
    private String datum;

    @Column(name = "Besetzung_Einsatzzeit")
    private String einsatzZeit;

    @Column(name = "Besetzung_BestätigungEinsatzkraft")
    private String bestätigungEinsatzkraft;

    @Column(name = "Besetzung_Pausenzeit")
    private String pauseZeit;


    @Column(name = "ProjektvertragRechnungskunde_ID")
    private int projektvertragRechnungskundeID;

    @Column(name = "Einsatzkraft_ID")
    private int einsatzkraftID;

    @Column(name = "Fläche_ID")
    private int flaecheID;


    @Column(name = "Besetzung_BestätigungFürRechnung")
    private String bestätigungfürRechunung;

    @Column(name = "Besetzung_AnfrageVersendung")
    private String anfrageVersendung;

    @Column(name = "Besetzung_EndDatum")
    private Timestamp endDatum;

    @Column(name = "Besetzung_StartDatum")
    private Timestamp startDatum;
}

