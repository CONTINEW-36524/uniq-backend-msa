package com.continew.uniqbackend.surveyread.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Table(name = "fav_survey")
public class My_favorites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFavSurvey", nullable = false)
    private Integer id;

    @Column(name = "user_code", nullable = false)
    private Integer uid;


    @Column(name = "idSurvey", nullable = false)
    private Integer sid;

    @ManyToOne(optional=false)
    @JoinColumn(name="idSurvey", referencedColumnName="id_survey",insertable=false, updatable=false)
    private Survey survey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Survey getSurvey() {return survey;}

    public Survey setSurvey() {
        this.survey = survey;
        return null;
    }
}