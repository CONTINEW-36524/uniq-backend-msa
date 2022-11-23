package com.continew.uniqbackend.surveyread.repository;

import com.continew.uniqbackend.surveyread.dto.DataDTOInterface;
import com.continew.uniqbackend.surveyread.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {
    //내가 최근에 만든 템플릿 = myuniq
    @Query(value = "select * from survey where writer = :user_id and survey.category LIKE :category and survey.likenum > :like", nativeQuery = true)
    public List<Survey> findRecentSurvey(@Param(value = "user_id") int user_id, @Param(value = "category") String category, @Param(value = "like") String like);

    //내가 찜한 템플릿
    @Query(value = "select survey.* from survey left join fav_survey on survey.id_survey = fav_survey.id_survey where fav_survey.user_code = :user_id and survey.category LIKE :category and survey.likenum > :like", nativeQuery = true)
    public List<Survey> findFavSurvey(@Param(value = "user_id") int user_id, @Param(value = "category") String category, @Param(value = "like") String like);


    @Query(value = "select * from survey as s1 left join question as q1 on s1.id_survey= q1.qid_survey left join contents as c1 on q1.id_question=c1.cid_question where s1.url= :url group by s1.id_survey,q1.id_question,c1.id_mult order by id_question ASC, c1.id_mult ASC", nativeQuery = true)
    public List<DataDTOInterface> findbyurl(@Param(value = "url") String url);


}