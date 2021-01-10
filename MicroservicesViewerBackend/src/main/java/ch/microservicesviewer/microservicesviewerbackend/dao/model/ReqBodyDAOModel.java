package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;

/**
 * DAO-Model fuer die Tabelle ReqBody
 */
@Entity
@Table(name = "ReqBody")
public class ReqBodyDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqBodyId")
    private Integer reqBodyId;

    @Column(name = "reqBodyContent", nullable = false)
    private String reqBodyContent;

    @OneToOne
    @JoinColumn(name = "requestId", referencedColumnName = "requestId", nullable = false)
    private RequestsDAOModel request;

    public Integer getReqBodyId() {
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

    public RequestsDAOModel getRequest() {
        return request;
    }

    public void setRequest(RequestsDAOModel request) {
        this.request = request;
    }

}
