package ch.microserviceviewerbackend.dao.daomodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Viewers")
public class ViewerModelDAO {

    @Id
    @Column(name = "ViewerUsername")
    private String viewerUsername;

    @Column(name = "ViewerPassword")
    private String viewerPassword;

    @Column(name = "ViewerName")
    private String viewerName;

    @Column(name = "Viewersurname")
    private String viewerSurname;

    public String getViewerUsername() {
        return viewerUsername;
    }

    public void setViewerUsername(String viewerUsername) {
        this.viewerUsername = viewerUsername;
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
        this.viewerUsername = viewerUsername;
    }
}
