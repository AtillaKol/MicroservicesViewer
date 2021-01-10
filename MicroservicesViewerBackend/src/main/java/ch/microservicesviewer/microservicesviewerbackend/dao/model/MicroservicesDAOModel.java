package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO-Model fuer die Tabelle Microservices
 */
@Entity
@Table(name = "Microservices")
public class MicroservicesDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "microserviceId")
    private Integer microserviceId;

    @Column(name = "microserviceURL", nullable = false)
    private String microserviceURL;

    @ManyToOne
    @JoinColumn(name = "viewerId", referencedColumnName = "viewerId", nullable = false)
    private ViewersDAOModel viewers;

    @OneToMany(mappedBy = "microservice")
    private List<RequestsDAOModel> requests = new ArrayList<>();

    public Integer getMicroserviceId() {
        return microserviceId;
    }

    public void setMicroserviceId(Integer microserviceId) {
        this.microserviceId = microserviceId;
    }

    public String getMicroserviceURL() {
        return microserviceURL;
    }

    public void setMicroserviceURL(String microserviceURL) {
        this.microserviceURL = microserviceURL;
    }

    public ViewersDAOModel getViewers() {
        return viewers;
    }

    public void setViewers(ViewersDAOModel viewers) {
        this.viewers = viewers;
    }

    public List<RequestsDAOModel> getRequests() {
        return requests;
    }

    public void setRequests(List<RequestsDAOModel> requests) {
        this.requests = requests;
    }

}
