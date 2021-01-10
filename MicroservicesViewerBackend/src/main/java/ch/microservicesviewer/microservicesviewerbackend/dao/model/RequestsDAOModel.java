package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO-Model fuer die Tabelle Requests
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

    @OneToOne
    @JoinColumn(name = "responseId", referencedColumnName = "responseId")
    private ResponsesDAOModel response;

    @ManyToOne
    @JoinColumn(name = "microserviceId", referencedColumnName = "microserviceId")
    private MicroservicesDAOModel microservice;

    @OneToMany(mappedBy = "request")
    private List<ReqHeadersValueDAOModel> reqHeadersValues = new ArrayList<>();

    @OneToOne(mappedBy = "request")
    private ReqBodyDAOModel reqBody;

    @OneToMany(mappedBy = "request")
    private List<ReqQueryParamsValueDAOModel> reqQueryParamsValues = new ArrayList<>();

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

    private ResponsesDAOModel getResponse() {
        return response;
    }

    public void setResponse(ResponsesDAOModel response) {
        this.response = response;
    }

    public MicroservicesDAOModel getMicroservice() {
        return microservice;
    }

    public void setMicroservice(MicroservicesDAOModel microservice) {
        this.microservice = microservice;
    }

    public List<ReqHeadersValueDAOModel> getReqHeadersValues() {
        return reqHeadersValues;
    }

    public void setReqHeadersValues(List<ReqHeadersValueDAOModel> reqHeadersValues) {
        this.reqHeadersValues = reqHeadersValues;
    }

    public ReqBodyDAOModel getReqBody() {
        return reqBody;
    }

    public void setReqBody(ReqBodyDAOModel reqBody) {
        this.reqBody = reqBody;
    }

    public List<ReqQueryParamsValueDAOModel> getReqQueryParamsValues() {
        return reqQueryParamsValues;
    }

    public void setReqQueryParamsValues(List<ReqQueryParamsValueDAOModel> reqQueryParamsValues) {
        this.reqQueryParamsValues = reqQueryParamsValues;
    }


}
