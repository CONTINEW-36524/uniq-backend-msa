package com.continew.uniqbackend.SurveyWrite.repository;

import com.continew.uniqbackend.SurveyWrite.entity.Contents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentsRepository extends JpaRepository<Contents, String> {
}