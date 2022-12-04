package com.continew.uniqbackend.surveyread.repository;



import com.continew.uniqbackend.surveyread.entity.Recent_survey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface My_uniqRepository extends JpaRepository<Recent_survey, Integer> {

    @Override
    List<Recent_survey> findAll();

//    @Query(value = "select survey_id from my_uniq where user_id= :user_id", nativeQuery = true)
//    public List<Integer> selectSurId(@Param(value = "user_id") int user_id);


//    @Query(value="select c.commentNo, c.writer, c.articleNo, c.content, u.profile_img from comment c, user u where articleNo=:articleNo and c.writer=u.nickname", nativeQuery=true)
//    List<Comment> Test(int articleNo);

//    @Query(value="select * from survey where writer=:user_code", nativeQuery=true)
//    List<Recent_survey> Test(int user_code);
}