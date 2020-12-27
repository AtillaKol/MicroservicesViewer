package ch.microservicesviewer.microservicesviewerbackend.configuration.dao.model;

import javax.persistence.*;

/**
 * Das DAO-Model fuer die Tabelle ReqQueryParams
 */
@Entity
@Table(name = "ReqQueryParams")
public class ReqQueryParams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqQueryId")
    private Integer reqQueryId;

    @Column(name = "reqQueryKey")
    private String reqQueryKey;

    @Column(name = "reqQueryValue")
    private String reqQueryValue;

    @ManyToOne
    @JoinColumn(name = "requestId", referencedColumnName = "requestId")
    private RequestsDAOModel requests;

    private Integer getReqQueryId() {
        return reqQueryId;
    }

    public void setReqQueryId(Integer reqQueryId) {
        this.reqQueryId = reqQueryId;
    }

    public String getReqQueryKey() {
        return reqQueryKey;
    }

    public void setReqQueryKey(String reqQueryKey) {
        this.reqQueryKey = reqQueryKey;
    }

    public String getReqQueryValue() {
        return reqQueryValue;
    }

    public void setReqQueryValue(String reqQueryValue) {
        this.reqQueryValue = reqQueryValue;
    }

    public RequestsDAOModel getRequests() {
        return requests;
    }

    public void setRequests(RequestsDAOModel requests) {
        this.requests = requests;
    }

}
