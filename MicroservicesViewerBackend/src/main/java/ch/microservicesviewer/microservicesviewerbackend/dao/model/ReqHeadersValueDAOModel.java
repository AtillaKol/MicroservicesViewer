package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;

/**
 * DAO-Model fuer die Tabelle ReqHeadersValue
 */
@Entity
@Table(name = "ReqHeadersValue")
public class ReqHeadersValueDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqHeaderValueId")
    private Integer reqHeaderValueId;

    @Column(name = "reqHeaderValueValue")
    private String reqHeaderValueValue;

    @ManyToOne
    @JoinColumn(name = "requestId", referencedColumnName = "requestId", nullable = false)
    private RequestsDAOModel request;

    @ManyToOne
    @JoinColumn(name = "reqHeaderId", referencedColumnName = "reqHeaderId", nullable = false)
    private ReqHeadersDAOModel reqHeaders;

    public Integer getReqHeaderValueId() {
        return reqHeaderValueId;
    }

    public void setReqHeaderValueId(Integer reqHeaderValueId) {
        this.reqHeaderValueId = reqHeaderValueId;
    }

    public String getReqHeaderValueValue() {
        return reqHeaderValueValue;
    }

    public void setReqHeaderValueValue(String reqHeaderValueValue) {
        this.reqHeaderValueValue = reqHeaderValueValue;
    }

    public RequestsDAOModel getRequest() {
        return request;
    }

    public void setRequest(RequestsDAOModel request) {
        this.request = request;
    }

    public ReqHeadersDAOModel getReqHeaders() {
        return reqHeaders;
    }

    public void setReqHeaders(ReqHeadersDAOModel reqHeaders) {
        this.reqHeaders = reqHeaders;
    }

}
