package com.nvd.training.designpatterns.execises.websearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileSearch extends Subject {

	public void iterate(String fileName) {
		Stream<String> lines;
		try {
			Path path = Paths.get(fileName);
			lines = Files.lines(path);

			lines.forEach(line -> {
				this.notifyChanged(line);
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void notifyChanged(String content) {
		this.notifyObserver(this, content);
	}
}
