package ch.microserviceviewerbackend.model;

public class MicroserviceModel {

    //The ID is not needed to be inputted, because this will be auto generated.

    private String microserviceURI;
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
