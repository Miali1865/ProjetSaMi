package com.example.projetvehicule;


import jakarta.persistence.*;

@Entity
@Table(name= "authentification")
public class Authentification {

    @Id
    @Column(name = "idlogin")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idlogin;

    @Column(name = "login")
    private String login;

    @Column(name = "motdepasse")
    private String motdepasse;

    public Integer getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(Integer idlogin) {
        this.idlogin = idlogin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
}
