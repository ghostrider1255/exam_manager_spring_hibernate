package com.javasree.spring.service;

import java.util.List;

import com.javasree.spring.model.ExamQuestion;

public interface ExamQuestionService {
	public void addExamQuestion(ExamQuestion examQuestion);
	public void updateExamQuestion(ExamQuestion examQuestion);
	public List<ExamQuestion> listExamQuestions();
	public ExamQuestion getExamQuestionById(long examQuestionId);
	public void removeExamQuestion(long examQuestionId);
}
