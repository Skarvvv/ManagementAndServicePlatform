package com.fp.service;

import com.fp.domain.feedback.FeedbackToDB;

import java.util.List;

public interface FeedbackService {

    List<FeedbackToDB> feedbacksByUid(int uid);

    void save(FeedbackToDB feedbackToDB);

}
