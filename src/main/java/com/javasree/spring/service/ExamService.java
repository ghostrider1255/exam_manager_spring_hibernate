package com.javasree.spring.service;

import java.util.List;

import com.javasree.spring.model.Exam;

public interface ExamService {
	public void addExam(Exam exam);
	public void updateExam(Exam exam);
	public List<Exam> listExams();
	public Exam getExamById(long examId);
	public void removeExam(long examId);
}
