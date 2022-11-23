package com.continew.uniqbackend.surveyread.Controller;

import com.continew.uniqbackend.surveyread.dto.DataDTOInterface;
import com.continew.uniqbackend.surveyread.dto.Surveydata;
import com.continew.uniqbackend.surveyread.entity.Contents;
import com.continew.uniqbackend.surveyread.entity.Question;
import com.continew.uniqbackend.surveyread.entity.Survey;
import com.continew.uniqbackend.surveyread.repository.ContentsRepository;
import com.continew.uniqbackend.surveyread.repository.QuestionRepository;
import com.continew.uniqbackend.surveyread.repository.SurveyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api")
public class SurveyController {


    @Autowired
    private SurveyRepository surveyRepository;
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ContentsRepository contentsRepository;







    @GetMapping("/create/respond")
    public HashMap<Long,List<DataDTOInterface>> getrespondpage(@RequestParam String url){
        List<DataDTOInterface> aa= surveyRepository.findbyurl(url);
        System.out.println(aa.get(0));
        HashMap<Long,List<DataDTOInterface>> respond = new HashMap<>();
        List<DataDTOInterface> contents =new ArrayList<>();
        long prev_qid=-1;
        for (DataDTOInterface dataDTOInterface : aa) {
            if (prev_qid == -1) {
                prev_qid = dataDTOInterface.getId_question();
                System.out.println(prev_qid);
                contents.add(dataDTOInterface);
            } else if (!(prev_qid==dataDTOInterface.getId_question())) {
                respond.put(prev_qid,contents );
                prev_qid=dataDTOInterface.getId_question();
                System.out.println(prev_qid);
                contents=new ArrayList<>();
                contents.add(dataDTOInterface);
            }
            else{
                contents.add(dataDTOInterface);
            }
        }
        respond.put(prev_qid,contents);
        System.out.println(respond);

        return respond;
    }


}
