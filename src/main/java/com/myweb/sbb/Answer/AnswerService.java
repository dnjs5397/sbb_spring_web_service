package com.myweb.sbb.Answer;

import com.myweb.sbb.Question.Question;
import com.myweb.sbb.User.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;


    public void create(Question question, String content, SiteUser author) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setQuestion(question);
        answer.setLocalDateTime(LocalDateTime.now());
        answer.setAuthor(author);
        this.answerRepository.save(answer);
    }
}
