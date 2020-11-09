package ch.microserviceviewerbackend.model;

/**
 * Custom class to store the uri and the response of the request.
 */
public class RequestStore {

    //Both of them will be set only when creating an object from this class.
    private final String uri;
    private final String response;

    public RequestStore(String uri, String response) {
        this.uri = uri;
        this.response = response;
    }

    public String getUri() {
        return uri;
    }

    public String getResponse() {
        return response;
    }

}
