package com.continew.uniqbackend.surveyread.dto;


import com.continew.uniqbackend.surveyread.entity.Survey;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Surveydata {

    String surveyid;

    String maintitle;
    String subtitle;

    List<QuestionDTO> data;
    String url;

    String tag;

    String category;


    int like;

    String writer;


    public String getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(String surveyid) {
        this.surveyid = surveyid;
    }

    public String getMaintitle() {
        return maintitle;
    }

    public void setMaintitle(String maintitle) {
        this.maintitle = maintitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<QuestionDTO> getData() {
        return data;
    }

    public void setData(List<QuestionDTO> data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }


    @Override
    public String toString() {
        return "Surveydata{" +
                "maintitle='" + maintitle + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", data=" + data +
                '}';
    }

    public Survey toEntity(){
        return new Survey (null,maintitle,subtitle, "tag", 3, null, "url", "category", 1);
    }


}
