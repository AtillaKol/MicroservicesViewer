package ch.microservicesviewer.microservicesviewerbackend.dao.model;

import javax.persistence.*;

/**
 * DAO-Model fuer die Tabelle ResBody
 */
@Entity
@Table(name = "ResBody")
public class ResBodyDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resBodyId")
    private Integer resBodyId;

    @Column(name = "resBodyContent", nullable = false)
    private String resBodyContent;

    @OneToOne(mappedBy = "resBody")
    private ResponsesDAOModel responses;

    public Integer getResBodyId() {
        return resBodyId;
    }

    public void setResBodyId(Integer resBodyId) {
        this.resBodyId = resBodyId;
    }

    public String getResBodyContent() {
        return resBodyContent;
    }

    public void setResBodyContent(String resBodyContent) {
        this.resBodyContent = resBodyContent;
    }

}
