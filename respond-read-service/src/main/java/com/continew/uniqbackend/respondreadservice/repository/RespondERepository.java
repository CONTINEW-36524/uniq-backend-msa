package com.continew.uniqbackend.respondreadservice.repository;

import com.continew.uniqbackend.respondreadservice.dto.Respond;
import com.continew.uniqbackend.respondreadservice.entity.RespondE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RespondERepository extends JpaRepository<RespondE, Long> {
	
    @Query(value = "select * from respond", nativeQuery = true)
    public List<RespondE> selectRes();
}
