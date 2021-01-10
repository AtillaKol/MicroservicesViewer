package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO-Model fuer die Tabelle Viewers
 */
@Entity
@Table(name = "Viewers")
public class ViewersDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "viewerId")
    private Integer viewerId;

    @Column(name = "viewerUsername", nullable = false, unique = true)
    private String viewerUsername;

    @Column(name = "viewerEMail", nullable = false, unique = true)
    private String viewerEMail;

    @Column(name = "viewerPassword", nullable = false, unique = true)
    private String viewerPassword;

    @Column(name = "viewerName", nullable = false, unique = true)
    private String viewerName;

    @Column(name = "viewerSurname", nullable = false, unique = true)
    private String viewerSurname;

    @OneToMany(mappedBy = "viewers")
    public List<MicroservicesDAOModel> microservices = new ArrayList<>();

    public Integer getViewerId() {
        return viewerId;
    }

    public void setViewerId(Integer viewerId) {
        this.viewerId = viewerId;
    }

    public String getViewerUsername() {
        return viewerUsername;
    }

    public void setViewerUsername(String viewerUsername) {
        this.viewerUsername = viewerUsername;
    }

    public String getViewerEMail() {
        return viewerEMail;
    }

    public void setViewerEMail(String viewerEMail) {
        this.viewerEMail = viewerEMail;
    }

    public String getViewerPassword() {
        return viewerPassword;
    }

    public void setViewerPassword(String viewerPassword) {
        this.viewerPassword = viewerPassword;
    }

    public String getViewerName() {
        return viewerName;
    }

    public void setViewerName(String viewerName) {
        this.viewerName = viewerName;
    }

    public String getViewerSurname() {
        return viewerSurname;
    }

    public void setViewerSurname(String viewerSurname) {
        this.viewerSurname = viewerSurname;
    }

    public List<MicroservicesDAOModel> getMicroservices() {
        return microservices;
    }

    public void setMicroservices(List<MicroservicesDAOModel> microservices) {
        this.microservices = microservices;
    }

}
