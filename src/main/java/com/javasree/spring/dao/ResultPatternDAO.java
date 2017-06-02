package com.javasree.spring.dao;

import java.util.List;

import com.javasree.spring.model.ResultPattern;

public interface ResultPatternDAO {
	
	public void addResultPattern(ResultPattern resultPattern);
	public void updateResultPattern(ResultPattern resultPattern);
	public List<ResultPattern> listResultPatterns();
	public ResultPattern getResultPatternById(long resultPatternId);
	public void removeResultPattern(long resultPatternId);
}
