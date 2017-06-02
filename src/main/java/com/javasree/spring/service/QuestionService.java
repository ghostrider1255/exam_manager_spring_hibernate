package com.javasree.spring.service;

import java.util.List;

import com.javasree.spring.model.Question;

public interface QuestionService {
	public void addQuestion(Question question);
	public void updateQuestion(Question question);
	public List<Question> listQuestions();
	public Question getQuestionById(long questionId);
	public void removeQuestion(long questionId);
	public List<Question> filterBySubject(long questionId);
}
