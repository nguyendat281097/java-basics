package com.nvd.training.designpatterns.exercises.websearch;

public interface IFilterStrategy {
	boolean accept(String query);
}
