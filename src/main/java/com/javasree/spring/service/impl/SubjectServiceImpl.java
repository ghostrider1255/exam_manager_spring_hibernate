package com.javasree.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.javasree.spring.dao.SubjectDAO;
import com.javasree.spring.model.Subject;
import com.javasree.spring.service.SubjectService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectDAO subjectDAO;
	
	public void setSubjectDAO(SubjectDAO subjectDAO) {
		this.subjectDAO = subjectDAO;
	}
	
	@Override
	@Transactional
	public void addSubject(Subject subject) {
		this.subjectDAO.addSubject(subject);
		
	}

	@Override
	@Transactional
	public void updateSubject(Subject subject) {
		this.subjectDAO.updateSubject(subject);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public List<Subject> listSubjects() {
		return this.subjectDAO.listSubjects();
	}

	@Override
	@Transactional
	public Subject getSubjectById(long id) {
		return this.subjectDAO.getSubjectById(id);
	}

	@Override
	@Transactional
	public void removeSubject(long id) {
		this.subjectDAO.removeSubject(id);
		
	}

}
