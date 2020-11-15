package ch.microserviceviewerbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "ViewerUsername",
        "ViewerPassword",
        "ViewerName",
        "ViewerSurname"
})
public class ViewerModel {

    @JsonProperty(value = "ViewerUsername")
    private String viewerUsername;
    @JsonProperty(value = "ViewerPassword")
    private String viewerPassword;
    @JsonProperty(value = "ViewerName")
    private String viewerName;
    @JsonProperty(value = "ViewerSurname")
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
        this.viewerSurname = viewerSurname;
    }

}
