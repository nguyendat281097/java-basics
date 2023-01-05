package com.nvd.training.designpatterns.execises.websearch;

public interface IFilterStrategy {
	boolean accept(String query);
}
