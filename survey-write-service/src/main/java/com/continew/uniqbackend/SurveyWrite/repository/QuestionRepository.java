package com.continew.uniqbackend.SurveyWrite.repository;

import com.continew.uniqbackend.SurveyWrite.entity.Question;
import com.continew.uniqbackend.SurveyWrite.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query(value = "select * from survey left join fav_survey on survey.id_survey = fav_survey.id_survey where fav_survey.user_code = :user_id", nativeQuery = true)
    public List<Survey> findxx(@Param(value = "user_id") int user_id);
}