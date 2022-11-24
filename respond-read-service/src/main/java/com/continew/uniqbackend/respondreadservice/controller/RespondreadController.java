package com.continew.uniqbackend.respondreadservice.controller;

import com.continew.uniqbackend.respondreadservice.RespondReadServiceApplication;
import com.continew.uniqbackend.respondreadservice.entity.RespondE;
import com.continew.uniqbackend.respondreadservice.dto.Respond;
import com.continew.uniqbackend.respondreadservice.repository.RespondERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api")
public class RespondreadController {

    private static final Logger log = LoggerFactory.getLogger(RespondReadServiceApplication.class);
    
    @Autowired
    private RespondERepository respondERepository;

    @GetMapping("/respond/read/answer")
    public List<RespondE> getPopular(){
        List<RespondE> responds = respondERepository.selectRes();
        log.info(responds.toString());

        return responds;
    }
}