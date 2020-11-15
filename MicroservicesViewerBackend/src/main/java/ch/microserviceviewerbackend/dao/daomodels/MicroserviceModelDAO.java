package ch.microserviceviewerbackend.dao.daomodels;

import javax.persistence.*;

@Entity
@Table(name = "Microservices")
public class MicroserviceModelDAO {

    @Id
    @GeneratedValue
    @Column(name = "MicroserviceId")
    private Integer microserviceId;

    @Column(name = "MicroserviceURI")
    private String microserviceURI;

    @Column(name = "ViewerUsername")
    private String viewerUsername;

    public Integer getMicroserviceId() {
        return microserviceId;
    }

    public void setMicroserviceId(Integer microserviceId) {
        this.microserviceId = microserviceId;
    }

    public String getMicroserviceURI() {
        return microserviceURI;
    }

    public void setMicroserviceURI(String microserviceURI) {
        this.microserviceURI = microserviceURI;
    }

    public String getViewerUsername() {
        return viewerUsername;
    }

}
