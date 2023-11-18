package tn.esprit.job.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Job  implements Serializable {
    private static final  long serialVersionUID = 6 ;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String service ;
    private Boolean etat ;

    public int getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
