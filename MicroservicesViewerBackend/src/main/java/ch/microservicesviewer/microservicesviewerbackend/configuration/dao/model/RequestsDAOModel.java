package ch.microservicesviewer.microservicesviewerbackend.configuration.dao.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Das DAO-Model fuer die Tabelle Requests
 */
@Entity
@Table(name = "Requests")
public class RequestsDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "requestId")
    private Integer requestId;

    @Column(name = "requestDate")
    private Date requestDate;

    @Column(name = "requestEndpoint")
    private String requestEndpoint;

    @ManyToOne
    @JoinColumn(name = "responseId", referencedColumnName = "responseId")
    private ResponsesDAOModel responses;

    @ManyToOne
    @JoinColumn(name = "microserviceId", referencedColumnName = "microserviceId")
    private MicroservicesDAOModel microservices;

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestEndpoint() {
        return requestEndpoint;
    }

    public void setRequestEndpoint(String requestEndpoint) {
        this.requestEndpoint = requestEndpoint;
    }

    public ResponsesDAOModel getResponses() {
        return responses;
    }

    public void setResponses(ResponsesDAOModel responses) {
        this.responses = responses;
    }

    public MicroservicesDAOModel getMicroservices() {
        return microservices;
    }

    public void setMicroservices(MicroservicesDAOModel microservices) {
        this.microservices = microservices;
    }

}
