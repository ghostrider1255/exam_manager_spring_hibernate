package com.javasree.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.javasree.spring.dao.ExamDAO;
import com.javasree.spring.model.Exam;
import com.javasree.spring.service.ExamService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ExamServiceImpl implements ExamService{

	@Autowired
	private ExamDAO examDAO;
	
	public void setExamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
	}
	
	@Override
	@Transactional
	public void addExam(Exam exam) {
		this.examDAO.addExam(exam);
		
	}

	@Override
	@Transactional
	public void updateExam(Exam exam) {
		this.examDAO.updateExam(exam);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public List<Exam> listExams() {
		return this.examDAO.listExams();
	}

	@Override
	@Transactional
	public Exam getExamById(long examId) {
		return this.examDAO.getExamById(examId);
	}

	@Override
	@Transactional
	public void removeExam(long examId) {
		this.examDAO.removeExam(examId);
		
	}

}
