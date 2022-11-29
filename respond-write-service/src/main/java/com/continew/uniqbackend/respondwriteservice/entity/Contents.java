package com.continew.uniqbackend.respondwriteservice.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "contents")
public class Contents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMult", nullable = false)
    private Long idmult;


    @Column(name = "subQuestion")
    private String con;


    @ManyToOne(fetch =  FetchType.LAZY, optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="cid_question", referencedColumnName="id_question")
    private Question question;

    @Builder
    public Contents(String con, Question question) {

        this.con = con;
        this.question=question;


    }
}