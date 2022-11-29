package com.continew.uniqbackend.respondwriteservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_question", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "type")
    private String type;


    @JsonIgnore
    @OneToMany(mappedBy = "question",  cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contents> content = new ArrayList<>();

    @ManyToOne(fetch =  FetchType.LAZY, optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="qid_survey", referencedColumnName="id_survey")
    private Survey survey;

    @Builder
    public Question(String title,String type, Survey survey) {
        this.title = title;
        this.survey=survey;
        this.type=type;

    }
}