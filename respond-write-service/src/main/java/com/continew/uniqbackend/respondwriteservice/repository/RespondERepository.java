package com.continew.uniqbackend.respondwriteservice.repository;

import com.continew.uniqbackend.respondwriteservice.entity.RespondE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RespondERepository extends JpaRepository<RespondE, Long> {
    @Query(value = "select * from respond", nativeQuery = true)
    public List<RespondE> selectRes();

}