package com.continew.uniqbackend.surveyread.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "recent_survey")
public class Recent_survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recent_survey", nullable = false)
    private Integer id;

    @Column(name = "user_code", nullable = false)
    private Integer user_code;

    @Column(name = "id_survey", nullable = false)
    private Integer idSurvey;



}