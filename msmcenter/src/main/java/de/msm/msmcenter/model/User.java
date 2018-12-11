package de.msm.msmcenter.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "LeistungskundeAccount" , schema="dbo")

public class User {
    public User(User user) {
        this.id = user.getId();
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.portalrecht = user.getPortalrecht();
        this.abteilung = user.getAbteilung();
    }

    public User() {
    }

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
