package ch.microservicesviewer.microservicesviewerbackend.configuration.dao.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Das DAO-Model fuer die Tabelle ResBody
 */
@Entity
@Table(name = "ResBody")
public class ResBodyDAOModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resBodyId")
    private Integer resBodyId;

    @Column(name = "resBodyContent")
    private String resBodyContent;

    @OneToMany(mappedBy = "resBody")
    private List<ResponsesDAOModel> responses = new ArrayList<>();

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
