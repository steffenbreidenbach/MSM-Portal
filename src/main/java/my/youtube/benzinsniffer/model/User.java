package my.youtube.benzinsniffer.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "LeistungskundeAccount" , schema="dbo")

public class User {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "LeistungskundeAccount_Login")
    private String login;

    @Column(name = "LeistungskundeAccount_Password")
    private String password;

    @Column(name = "Portalrechte")
    private String portalrecht;

    @Column(name = "LeistungkundeAccount_Abteilung")
    private String abteilung;
}
