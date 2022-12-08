package com.continew.uniqbackend.respondwriteservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_survey", nullable = false)
    private Long id;

    @Column(name = "maintitle")
    private String maintitle;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "tag")
    private String tag;

    @Column(name = "likenum")
    private Integer likenum;

    @Column(name = "timestamp", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp timestamp;

    @Column(name = "url")
    private String url;

    @Column(name = "writer")
    private Integer writer;


    @Column(name = "category")
    private String category;

    //추가, 조인 컬럼 삭제
    @JsonIgnore
    @OneToMany(mappedBy = "survey",  cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> question = new ArrayList<>();


    public void setId(Long id) {
        this.id = id;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public Integer getWriter() {
        return writer;
    }

    public void setWriter(Integer writer) {
        this.writer = writer;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMaintitle() {
        return maintitle;
    }

    public void setMaintitle(String maintitle) {
        this.maintitle = maintitle;
    }

    @Builder
    public Survey(Long id, String maintitle, String subtitle,
                  String tag, int likenum, Timestamp timestamp, String url, String category, Integer writer) {

        this.id = id;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.tag = tag;
        this.likenum = likenum;
        this.timestamp = timestamp;
        this.url = url;
        this.writer = writer;

    }
}