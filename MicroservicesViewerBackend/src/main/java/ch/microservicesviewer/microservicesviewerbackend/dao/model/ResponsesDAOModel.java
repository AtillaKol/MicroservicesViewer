package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * DAO fuer die Tabelle Responses
 */
@Entity
@Table(name = "Responses")
public class ResponsesDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "responseId")
    private Integer responseId;

    @Column(name = "responseDate", nullable = false)
    private Date responseDate;

    @OneToOne
    @JoinColumn(name = "resBodyId", referencedColumnName = "resBodyId")
    private ResBodyDAOModel resBody;

    @ManyToOne
    @JoinColumn(name = "statusId")
    private HttpStatusDAOModel httpStatus;

    @OneToOne(mappedBy = "response")
    private RequestsDAOModel request;

    public Integer getResponseId() {
        return responseId;
    }

    public void setResponseId(Integer responseId) {
        this.responseId = responseId;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public ResBodyDAOModel getResBody() {
        return resBody;
    }

    public void setResBody(ResBodyDAOModel resBody) {
        this.resBody = resBody;
    }

    public HttpStatusDAOModel getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatusDAOModel httpStatus) {
        this.httpStatus = httpStatus;
    }

    public RequestsDAOModel getRequest() {
        return request;
    }

    public void setRequest(RequestsDAOModel request) {
        this.request = request;
    }

}
