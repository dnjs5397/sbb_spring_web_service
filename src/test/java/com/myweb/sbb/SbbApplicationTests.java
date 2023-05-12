package com.myweb.sbb;

import com.myweb.sbb.Answer.Answer;
import com.myweb.sbb.Answer.AnswerRepository;
import com.myweb.sbb.Question.QuestionService;
import jakarta.transaction.Transactional;
import com.myweb.sbb.Question.Question;
import com.myweb.sbb.Question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i=1; i<=300; i++) {
			String subject = String.format("테스트데이터 : [%d]", i);
			String content = "테스트 content";
			this.questionService.questionCreate(subject, content, null);
		}
	}

}
