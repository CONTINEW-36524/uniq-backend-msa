package com.continew.uniqbackend.SurveyWrite.controller;

import com.continew.uniqbackend.SurveyWrite.SurveyWriteApplication;

import com.continew.uniqbackend.SurveyWrite.dto.Surveydata;
import com.continew.uniqbackend.SurveyWrite.entity.Contents;
import com.continew.uniqbackend.SurveyWrite.entity.Question;
import com.continew.uniqbackend.SurveyWrite.entity.Survey;

import com.continew.uniqbackend.SurveyWrite.repository.ContentsRepository;
import com.continew.uniqbackend.SurveyWrite.repository.QuestionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@ResponseBody
@RequestMapping("/api")
public class SurveyController {

    private static final Logger log = LoggerFactory.getLogger(SurveyWriteApplication.class);


    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ContentsRepository contentsRepository;

    @PostMapping("/create/survey")
    public String postsurvey (@RequestBody Surveydata data123){
        System.out.println(data123);
        Survey data2= Survey.builder().
                maintitle(data123.getMaintitle()).
                subtitle(data123.getSubtitle()).
                url(data123.getUrl()).build();


    for(int i=0;i<data123.getData().size();i++) {
        Question question1 = Question.builder().
                title(data123.getData().get(i).getTitle())
                .survey(data2)
                .type(data123.getData().get(i).getType()).build();
        data2.getQuestion().add(question1);
        questionRepository.save(question1);
    for(int k=0;k<data123.getData().get(i).getContentdata().size();k++)
        {
            System.out.println("111");
            Contents contents = Contents.builder().
                    con(data123.getData().get(i).getContentdata().get(k).getCon())
                    .question(question1).build();
            contentsRepository.save(contents);
        }
    }
        return "good";
    }

}
