package com.continew.uniqbackend.surveyread.repository;

import com.continew.uniqbackend.surveyread.entity.Contents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentsRepository extends JpaRepository<Contents, String> {
}