package com.fp.controller;

import com.fp.domain.feedback.Feedback;
import com.fp.domain.feedback.FeedbackToDB;
import com.fp.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("feedbacksByUid")
    public List<FeedbackToDB> feedbacksByUid(int uid){
        return feedbackService.feedbacksByUid(uid);
    }

    @GetMapping("save")
    public void save(FeedbackToDB feedbackToDB){
        feedbackService.save(feedbackToDB);
    }

}
