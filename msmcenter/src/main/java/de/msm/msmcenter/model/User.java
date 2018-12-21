/*package de.msm.msmcenter.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "user" , schema="dbo")

public class User {
    public User(User user) {
        this.id = user.getId();
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.portalrecht = user.getPortalrecht();
        this.email = user.getEmail();
    }

    public User() {
    }

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "username")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "protalrecht")
    private String portalrecht;

    @Column(name = "email")
    private String email;

}
*/