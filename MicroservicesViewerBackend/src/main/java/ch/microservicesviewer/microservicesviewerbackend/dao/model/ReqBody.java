package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;

/**
 * Das DAO-Model fuer die Tabelle Microservices
 */
@Entity
@Table(name = "ReqBody")
public class ReqBody {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqBodyId")
    private Integer reqBodyId;

    @Column(name = "reqBodyContent")
    private String reqBodyContent;

    @ManyToOne
    @JoinColumn(name = "requestId", referencedColumnName = "requestId")
    private RequestsDAOModel requests;

    private Integer getReqBodyId() {
        return reqBodyId;
    }

    public void setReqBodyId(Integer reqBodyId) {
        this.reqBodyId = reqBodyId;
    }

    public String getReqBodyContent() {
        return reqBodyContent;
    }

    public void setReqBodyContent(String reqBodyContent) {
        this.reqBodyContent = reqBodyContent;
    }

    public RequestsDAOModel getRequestId() {
        return requests;
    }

    public void setRequests(RequestsDAOModel requests) {
        this.requests = requests;
    }

}
