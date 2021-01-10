package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO-Model fuer die Tabelle HttpStatus
 */
@Entity
@Table(name = "HttpStatus")
public class HttpStatusDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statusId")
    private Integer statusId;

    @Column(name = "statusCode", nullable = false, unique = true)
    private Integer statusCode;

    @Column(name = "statusMessage", nullable = false, unique = true)
    private String statusMessage;

    @OneToMany(mappedBy = "httpStatus")
    private List<ResponsesDAOModel> responses = new ArrayList<>();

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

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

    public List<ResponsesDAOModel> getResponses() {
        return responses;
    }

    public void setResponses(List<ResponsesDAOModel> responses) {
        this.responses = responses;
    }

}
