package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;

/**
 * DAO-Model fuer die Tabelle ReqQueryParamsValue
 */
@Entity
@Table(name = "ReqQueryParamsValue")
public class ReqQueryParamsValueDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqQueryParamValueId")
    private Integer reqQueryParamValueId;

    @Column(name = "reqQueryParamValueValue")
    private String reqQueryParamValueValue;

    @ManyToOne
    @JoinColumn(name = "requestId", referencedColumnName = "requestId", nullable = false)
    private RequestsDAOModel request;

    @ManyToOne
    @JoinColumn(name = "reqQueryId", referencedColumnName = "reqQueryId")
    private ReqQueryParamsDAOModel reqQueryParam;

    public Integer getReqQueryParamValueId() {
        return reqQueryParamValueId;
    }

    public void setReqQueryParamValueId(Integer reqQueryParamValueId) {
        this.reqQueryParamValueId = reqQueryParamValueId;
    }

    public String getReqQueryParamValueValue() {
        return reqQueryParamValueValue;
    }

    public void setReqQueryParamValueValue(String reqQueryParamValueValue) {
        this.reqQueryParamValueValue = reqQueryParamValueValue;
    }

    public RequestsDAOModel getRequest() {
        return request;
    }

    public void setRequest(RequestsDAOModel request) {
        this.request = request;
    }

    public ReqQueryParamsDAOModel getReqQueryParam() {
        return reqQueryParam;
    }

    public void setReqQueryParam(ReqQueryParamsDAOModel reqQueryParam) {
        this.reqQueryParam = reqQueryParam;
    }

}
