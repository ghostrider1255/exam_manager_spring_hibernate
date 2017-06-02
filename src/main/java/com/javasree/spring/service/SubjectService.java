package com.javasree.spring.service;

import java.util.List;

import com.javasree.spring.model.Subject;

public interface SubjectService {
	public void addSubject(Subject subject);
	public void updateSubject(Subject subject);
	public List<Subject> listSubjects();
	public Subject getSubjectById(long id);
	public void removeSubject(long id);
}
