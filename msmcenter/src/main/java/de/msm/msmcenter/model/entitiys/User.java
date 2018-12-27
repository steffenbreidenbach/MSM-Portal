package de.msm.msmcenter.model.entitiys;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Users", schema = "dbo")
public class User {
  public User(User user) {
    this.id = user.getId();
    this.username = user.getUsername();
    this.password = user.getPassword();
    this.portalrecht = user.getPortalrecht();
    this.email = user.getEmail();
  }

  public User() {
  }

  @Column(name="username")
  private String username;

  @Column(name="email")
  private String email;

  @Column(name="password")
  private String password;

  @Column(name="portalrecht")
  private String portalrecht;

  @Id
  @Column(name="ID")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;

}
