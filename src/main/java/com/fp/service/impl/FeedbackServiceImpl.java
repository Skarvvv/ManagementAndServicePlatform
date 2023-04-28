package com.fp.service.impl;

import com.fp.domain.feedback.Feedback;
import com.fp.domain.feedback.FeedbackToDB;
import com.fp.mapper.FeedbackMapper;
import com.fp.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public List<FeedbackToDB> feedbacksByUid(int uid) {
        List<Feedback> feedbacks = feedbackMapper.feedbacksByUid(uid);
        List<FeedbackToDB> feedbackToDBS = new ArrayList<>();
        for (Feedback feedback : feedbacks){
            FeedbackToDB feedbackToDB = new FeedbackToDB();
            feedbackToDB.setFid(feedback.getFid());
            feedbackToDB.setFcode(feedback.getFcode());
            feedbackToDB.setUid(feedback.getUid());
            feedbackToDB.setFcontent(feedback.getFcontent());
            feedbackToDB.setFtime(feedback.getFtime().toString().substring(0, feedback.getFtime().toString().length()-2));
            feedbackToDBS.add(feedbackToDB);
        }
        return feedbackToDBS;
    }

    @Override
    public void save(FeedbackToDB feedbackToDB) {
        Feedback feedback = new Feedback();
        feedback.setFcode(UUID.randomUUID().toString());
        feedback.setUid(feedbackToDB.getUid());
        feedback.setFcontent(feedbackToDB.getFcontent());
        feedback.setFtime(new Timestamp(new Date().getTime()));
        feedbackMapper.save(feedback);
    }
}
