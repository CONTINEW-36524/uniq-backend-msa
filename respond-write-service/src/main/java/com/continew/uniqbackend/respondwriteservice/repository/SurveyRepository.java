package com.continew.uniqbackend.respondwriteservice.repository;

import com.continew.uniqbackend.respondwriteservice.dto.DataDTOInterface;
import com.continew.uniqbackend.respondwriteservice.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {

    @Query(value = "select * from survey as s1 left join question as q1 on s1.id_survey= q1.qid_survey left join contents as c1 on q1.id_question=c1.cid_question where s1.url= :url group by s1.id_survey,q1.id_question,c1.id_mult order by id_question ASC, c1.id_mult ASC", nativeQuery = true)
    public List<DataDTOInterface> findbyurl(@Param(value = "url") String url);


}