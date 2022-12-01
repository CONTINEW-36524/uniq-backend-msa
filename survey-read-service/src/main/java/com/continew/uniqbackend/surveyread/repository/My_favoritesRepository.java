package com.continew.uniqbackend.surveyread.repository;


import com.continew.uniqbackend.surveyread.entity.My_favorites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface My_favoritesRepository extends JpaRepository<My_favorites, Integer> {
    //나의 uniq
    @Query(value = "select survey_id from my_favorites where user_id= :user_id", nativeQuery = true)
    public List<Integer> selectFav(@Param(value = "user_id") int user_id);


}