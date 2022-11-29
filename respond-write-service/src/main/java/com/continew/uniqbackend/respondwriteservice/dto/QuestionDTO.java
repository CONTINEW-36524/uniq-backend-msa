package com.continew.uniqbackend.respondwriteservice.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class QuestionDTO {
    private String did;
    private String title;
    private String type;
    @JsonProperty
    private List<Contentdata> content;
    public String getDId() {
        return did;
    }
    public void setDId(String did) {
        this.did = did;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<Contentdata> getContentdata() {
        return content;
    }
    public void setContentdata(List<Contentdata> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "{" +
                "\"did\": \"" + did + '\"' +
                ", \"title\": \"" + title + '\"' +
                ", \"type\": \"" + type + '\"' +
                ", \"content\": " + content +
                '}';
    }


}
