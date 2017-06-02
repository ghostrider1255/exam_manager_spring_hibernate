package com.javasree.spring.dao;

import java.util.List;

import com.javasree.spring.model.Exam;

public interface ExamDAO {
	
	public void addExam(Exam exam);
	public void updateExam(Exam exam);
	public List<Exam> listExams();
	public Exam getExamById(long examId);
	public void removeExam(long examId);
}
