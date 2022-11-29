package com.continew.uniqbackend.respondwriteservice.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "respond")
public class RespondE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long respondid;
    @Column(name = "surveyid")
    private Long surveyid;

    @Column(name = "answer")
    private String answer;

    public Long getRespondid() {
        return respondid;
    }

    public void setRespondid(Long respondid) {
        this.respondid = respondid;
    }

    public Long getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(Long surveyid) {
        this.surveyid = surveyid;
    }

    public String getRid_question() {
        return rid_question;
    }

    public void setRid_question(String rid_question) {
        this.rid_question = rid_question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Column(name = "rid_question")
    private String  rid_question;

    @Override
    public String toString() {
        return "RespondE{" +
                "respondid=" + respondid +
                ", surveyid=" + surveyid +
                ", rid_question='" + rid_question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public RespondE(Long respondid, Long surveyid, String rid_question, String answer){
        this.surveyid=surveyid;
        this.respondid=respondid;
        this.rid_question=rid_question;
        this.answer=answer;
    }
}