package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO-Model fuer die Tabelle ReqQueryParams
 */
@Entity
@Table
public class ReqQueryParamsDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqQueryId")
    private Integer reqQueryId;

    @Column(name = "reqQueryKey", unique = true, nullable = false)
    private String reqQueryKey;

    @OneToMany(mappedBy = "reqQueryParam")
    private List<ReqQueryParamsValueDAOModel> reqQueryParamsValues = new ArrayList<>();

    public Integer getReqQueryId() {
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

    public List<ReqQueryParamsValueDAOModel> getReqQueryParamsValues() {
        return reqQueryParamsValues;
    }

    public void setReqQueryParamsValues(List<ReqQueryParamsValueDAOModel> reqQueryParamsValues) {
        this.reqQueryParamsValues = reqQueryParamsValues;
    }

}
