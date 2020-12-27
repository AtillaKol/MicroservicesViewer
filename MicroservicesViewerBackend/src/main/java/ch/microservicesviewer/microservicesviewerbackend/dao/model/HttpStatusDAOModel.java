package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Das DAO-Model fuer die Tabelle HttpStatus
 */
@Entity
@Table(name = "HttpStatus")
public class HttpStatusDAOModel {

    @Id
    @Column(name = "statusCode")
    private Integer statusCode;

    @Column(name = "statusMessage")
    private String statusMessage;

    @OneToMany(mappedBy = "httpStatus")
    private List<ResponsesDAOModel> responses = new ArrayList<>();

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    private List<ResponsesDAOModel> getResponses() {
        return responses;
    }

    public void setResponses(List<ResponsesDAOModel> responses) {
        this.responses = responses;
    }

}
