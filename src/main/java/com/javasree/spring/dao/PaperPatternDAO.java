package com.javasree.spring.dao;

import java.util.List;
import java.util.Map;

import com.javasree.spring.model.ExamQuestion;
import com.javasree.spring.model.PaperPattern;

public interface PaperPatternDAO {
	
	public void addPaperPattern(PaperPattern paperPattern);
	public void updatePaperPattern(PaperPattern paperPattern);
	public List<PaperPattern> listPaperPatterns();
	public PaperPattern getPaperPatternById(long paperPatternId);
	public void removePaperPattern(long paperPatternId);
	Map<String, ExamQuestion> getQuestionByPatternId(long patternId);
}
