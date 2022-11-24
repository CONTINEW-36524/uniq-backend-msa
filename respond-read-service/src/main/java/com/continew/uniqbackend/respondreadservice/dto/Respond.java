package com.continew.uniqbackend.respondreadservice.dto;

import com.continew.uniqbackend.respondreadservice.entity.RespondE;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Respond {

    private Long surveyid;

    private List<Responddata> responddata;

    @Override
    public String toString() {
        return "Respond{" +
                "surveyid=" + surveyid +
                ", responddata=" + responddata +
                '}';
    }

    public List<Responddata> getResponddata() {
        return responddata;
    }

    public void setResponddata(List<Responddata> responddata) {
        this.responddata = responddata;
    }

    public Long getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(Long surveyid) {
        this.surveyid = surveyid;
    }



    public RespondE toEntity(int i){
        return new RespondE(null,surveyid,responddata.get(i).getRid_question(),responddata.get(i).getAnswer() );
    }
}