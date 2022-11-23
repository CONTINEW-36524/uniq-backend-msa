package com.continew.uniqbackend.respondwriteservice.dto;

public class Responddata {

    private Long id;
    private String answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String rid_question;


    @Override
    public String toString() {
        return "Responddata{" +
                "rid_question='" + rid_question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
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
}
