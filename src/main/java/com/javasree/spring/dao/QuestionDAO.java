package com.javasree.spring.dao;

import java.util.List;

import com.javasree.spring.model.Question;

public interface QuestionDAO {
	
	public void addQuestion(Question question);
	public void updateQuestion(Question question);
	public List<Question> listQuestions();
	public Question getQuestionById(long id);
	public void removeQuestion(long id);
	public List<Question> filterBySubject(long questionId);
}
