package ch.microservicesviewer.microservicesviewerbackend.configuration.dao.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Das DAO-Model fuer die Tabelle Responses
 */
@Entity
@Table(name = "Responses")
public class ResponsesDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "responseId")
    private Integer responseId;

    @Column(name = "responseDate")
    private Date responseDate;

    @ManyToOne
    @JoinColumn(name = "resBodyId", referencedColumnName = "resBodyId")
    private ResBodyDAOModel resBody;

    @ManyToOne
    @JoinColumn(name = "statusCode", referencedColumnName = "statusCode")
    private HttpStatusDAOModel httpStatus;

    @OneToMany(mappedBy = "responses")
    private List<RequestsDAOModel> requests;

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


}
