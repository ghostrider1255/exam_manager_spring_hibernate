package com.javasree.spring.service;

import java.util.List;

import com.javasree.spring.model.ResultPattern;

public interface ResultPatternService {
	
	public void addResultPattern(ResultPattern resultPattern);
	public void updateResultPattern(ResultPattern resultPattern);
	public List<ResultPattern> listResultPatterns();
	public ResultPattern getResultPatternById(long resultPatternId);
	public void removeResultPattern(long resultPatternId);
}
