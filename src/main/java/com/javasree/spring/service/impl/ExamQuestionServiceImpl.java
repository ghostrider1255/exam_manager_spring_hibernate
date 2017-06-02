package com.javasree.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.javasree.spring.dao.ExamQuestionDAO;
import com.javasree.spring.model.ExamQuestion;
import com.javasree.spring.service.ExamQuestionService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ExamQuestionServiceImpl implements ExamQuestionService{

	@Autowired
	private ExamQuestionDAO examQuestionDAO;
	
	public void setExamQuestionDAO(ExamQuestionDAO examQuestionDAO) {
		this.examQuestionDAO = examQuestionDAO;
	}
	
	@Override
	@Transactional
	public void addExamQuestion(ExamQuestion examQuestion) {
		this.examQuestionDAO.addExamQuestion(examQuestion);
		
	}

	@Override
	@Transactional
	public void updateExamQuestion(ExamQuestion examQuestion) {
		this.examQuestionDAO.updateExamQuestion(examQuestion);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public List<ExamQuestion> listExamQuestions() {
		return this.examQuestionDAO.listExamQuestions();
	}

	@Override
	@Transactional
	public ExamQuestion getExamQuestionById(long examQuestionId) {
		return this.examQuestionDAO.getExamQuestionById(examQuestionId);
	}

	@Override
	@Transactional
	public void removeExamQuestion(long examQuestionId) {
		this.examQuestionDAO.removeExamQuestion(examQuestionId);
		
	}

}
