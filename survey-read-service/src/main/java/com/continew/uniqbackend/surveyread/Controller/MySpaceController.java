package com.continew.uniqbackend.surveyread.Controller;


import com.continew.uniqbackend.surveyread.SurveyreadApplication;
import com.continew.uniqbackend.surveyread.entity.Survey;
import com.continew.uniqbackend.surveyread.repository.My_favoritesRepository;
import com.continew.uniqbackend.surveyread.repository.My_uniqRepository;
import com.continew.uniqbackend.surveyread.repository.SurveyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api/myspace")
public class MySpaceController {

    private static final Logger log = LoggerFactory.getLogger(SurveyreadApplication.class);

    @Autowired
    private My_uniqRepository MyuniqRepository;

    @Autowired
    private My_favoritesRepository MyfavRepository;

    @Autowired
    private SurveyRepository surveyRepository;


    @GetMapping("/my-uniq")
    public List<Survey> getMySurvey(@RequestParam("user_id") int user_id, @RequestParam("category") String category, @RequestParam("like") String like){
        List<Survey> surveys = surveyRepository.findRecentSurvey(user_id, category, like);

        return surveys;
    }

    @GetMapping("/my-favorites")
    public List<Survey> getFav(@RequestParam("user_id") int user_id, @RequestParam("category") String category, @RequestParam("like") String like){
        List<Survey> surveys = surveyRepository.findFavSurvey(user_id, category, like);
        log.info(surveys.toString());

        return surveys;
    }
}