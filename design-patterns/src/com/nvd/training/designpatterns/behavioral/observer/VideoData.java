package com.nvd.training.designpatterns.behavioral.observer;

public class VideoData extends Subject {
	private String title;
	private String description;
	private String fileName;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		this.videoDataChanged();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		this.videoDataChanged();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		this.videoDataChanged();
	}

	private void videoDataChanged() {
		this.notifyObserver(this);
	}

}
