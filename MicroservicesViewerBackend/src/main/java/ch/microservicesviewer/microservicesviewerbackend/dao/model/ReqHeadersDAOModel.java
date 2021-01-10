package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO-Model fuer die Tabelle ReqHeaders
 */
@Entity
@Table(name = "ReqHeaders")
public class ReqHeadersDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqHeaderId")
    private Integer reqHeaderId;

    @Column(name = "reqHeaderKey", unique = true, nullable = false)
    private String reqHeaderKey;

    @OneToMany(mappedBy = "reqHeaders")
    private List<ReqHeadersValueDAOModel> reqHeadersValues = new ArrayList<>();

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

    private List<ReqHeadersValueDAOModel> getReqHeadersValues() {
        return reqHeadersValues;
    }

    public void setReqHeadersValues(List<ReqHeadersValueDAOModel> reqHeadersValues) {
        this.reqHeadersValues = reqHeadersValues;
    }

}
