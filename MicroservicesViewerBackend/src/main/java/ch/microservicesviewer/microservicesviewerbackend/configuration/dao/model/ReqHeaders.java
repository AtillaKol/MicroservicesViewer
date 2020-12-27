package ch.microservicesviewer.microservicesviewerbackend.configuration.dao.model;

import javax.persistence.*;

/**
 * Das DAO-Model fuer die Tabelle ReqHeaders
 */
@Entity
@Table(name = "ReqHeaders")
public class ReqHeaders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqHeaderId")
    private Integer reqHeaderId;

    @Column(name = "reqHeaderKey")
    private String reqHeaderKey;

    @Column(name = "reqHeaderValue")
    private String reqHeaderValue;

    @ManyToOne
    @JoinColumn(name = "requestId", referencedColumnName = "requestId")
    private RequestsDAOModel requests;

    public Integer getReqHeaderId() {
        return reqHeaderId;
    }

    public void setReqHeaderId(Integer reqHeaderId) {
        this.reqHeaderId = reqHeaderId;
    }

    public String getReqHeaderKey() {
        return reqHeaderKey;
    }

    public void setReqHeaderKey(String reqHeaderKey) {
        this.reqHeaderKey = reqHeaderKey;
    }

    public String getReqHeaderValue() {
        return reqHeaderValue;
    }

    public void setReqHeaderValue(String reqHeaderValue) {
        this.reqHeaderValue = reqHeaderValue;
    }

    public RequestsDAOModel getRequests() {
        return requests;
    }

    public void setRequests(RequestsDAOModel requests) {
        this.requests = requests;
    }

}
