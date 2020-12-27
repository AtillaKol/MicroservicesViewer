package ch.microservicesviewer.microservicesviewerbackend.configuration.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Das DAO-Model fuer die Tabelle Viewers
 */
@Entity
@Table(name = "Viewers")
public class ViewersDAOModel {

    @Id
    @Column(name = "viewerUsername")
    private String viewerUsername;

    @Column(name = "viewerEMail")
    private String viewerEMail;

    @Column(name = "viewerPassword")
    private String viewerPassword;

    @Column(name = "viewerName")
    private String viewerName;

    @Column(name = "viewerSurname")
    private String viewerSurname;

    @OneToMany(mappedBy = "viewers")
    private List<MicroservicesDAOModel> microservices = new ArrayList<>();

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
