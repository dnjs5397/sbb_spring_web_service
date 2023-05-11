package com.myweb.sbb.Answer;

import com.myweb.sbb.Question.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setQuestion(question);
        answer.setLocalDateTime(LocalDateTime.now());
        this.answerRepository.save(answer);
    }
}
