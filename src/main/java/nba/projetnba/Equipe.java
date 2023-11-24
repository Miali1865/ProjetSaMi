package nba.projetnba;

import jakarta.persistence.*;

@Entity
@Table(name = "equipe")
public class Equipe {

    @Id
    @Column(name = "idequipe")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idequipe;
    private String nomequipe;
    private String lieuprovenance;

    public Integer getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(Integer idequipe) {
        this.idequipe = idequipe;
    }

    public String getNomequipe() {
        return nomequipe;
    }

    public void setNomequipe(String nomequipe) {
        this.nomequipe = nomequipe;
    }

    public String getLieuprovenance() {
        return lieuprovenance;
    }

    public void setLieuprovenance(String lieuprovenance) {
        this.lieuprovenance = lieuprovenance;
    }
}
