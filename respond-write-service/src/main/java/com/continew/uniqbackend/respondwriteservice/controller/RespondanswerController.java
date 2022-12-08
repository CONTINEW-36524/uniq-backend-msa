package com.continew.uniqbackend.respondwriteservice.controller;

import com.continew.uniqbackend.respondwriteservice.dto.DataDTOInterface;
import com.continew.uniqbackend.respondwriteservice.entity.RespondE;
import com.continew.uniqbackend.respondwriteservice.dto.Respond;
import com.continew.uniqbackend.respondwriteservice.repository.RespondERepository;
import com.continew.uniqbackend.respondwriteservice.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api")
public class RespondanswerController {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private RespondERepository respondERepository;
    
    @Cacheable(value = "WriteRespond-createRespond")
    @GetMapping("/create/respond")
    public HashMap<Long, List<DataDTOInterface>> getrespondpage(@RequestParam String url){
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


    @PostMapping("/respond/answer")
    public void respondinsert( @RequestBody Respond data) {
        System.out.println(data);

        for(int i=0;i<data.getResponddata().size();i++) {
            RespondE data1 = data.toEntity(i);
            System.out.println(data1.toString());

            RespondE saved = respondERepository.save(data1);
            System.out.println(saved.toString());
        }
    }


    @GetMapping("/test")
    public String test() {
        return "respond-write-service and frontend connection success";
    }
}
