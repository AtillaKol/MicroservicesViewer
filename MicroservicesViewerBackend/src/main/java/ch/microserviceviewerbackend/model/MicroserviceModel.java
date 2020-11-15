package ch.microserviceviewerbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "MicroserviceURI",
        "ViewerUsername"
})
public class MicroserviceModel {

    //The ID is not needed to be inputted, because this will be auto generated.

    @JsonProperty(value = "MicroserviceURI")
    private String microserviceURI;
    @JsonProperty(value = "ViewerUsername")
    private String viewerUsername;

    public String getMicroserviceURI() {
        return microserviceURI;
    }

    public void setMicroserviceURI(String microserviceURI) {
        this.microserviceURI = microserviceURI;
    }

    public String getViewerUsername() {
        return viewerUsername;
    }

    public void setViewerUsername(String viewerUsername) {
        this.viewerUsername = viewerUsername;
    }

}
