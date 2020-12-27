package ch.microservicesviewer.microservicesviewerbackend.configuration.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Das DAO-Model fuer die Tabelle Microservices
 */
@Entity
@Table(name = "Microservices")
public class MicroservicesDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "microserviceId")
    private Integer microserviceId;

    @Column(name = "microserviceURL")
    private String microserviceURL;

    @ManyToOne
    @JoinColumn(name = "viewerUsername", referencedColumnName = "viewerUsername")
    private ViewersDAOModel viewers;

    @OneToMany(mappedBy = "microservices")
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

    public ViewersDAOModel getViewersDAOModel() {
        return viewers;
    }

    public void setViewersDAOModel(ViewersDAOModel viewersDAOModel) {
        this.viewers = viewersDAOModel;
    }

    public List<RequestsDAOModel> getRequests() {
        return requests;
    }

    public void setRequests(List<RequestsDAOModel> requests) {
        this.requests = requests;
    }

}
