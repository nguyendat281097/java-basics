package com.nvd.training.designpatterns.behavioral.observer.notifiers;

import com.nvd.training.designpatterns.behavioral.observer.Subject;
import com.nvd.training.designpatterns.behavioral.observer.VideoData;

public class FacebookNotifier extends AbstractObserver {

	public FacebookNotifier(Subject subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}
	
	@Override
	public void notify(Subject subject, Object... objects) {
		if (subject instanceof VideoData) {
			VideoData videoData = (VideoData) subject;
			System.out.printf(
					"Notify all subscribers via FACEBOOK with new data" + "\n\tName: %s" + "\n\tDescription: %s"
							+ "\n\tFile name: %s",
					videoData.getTitle(), videoData.getDescription(), videoData.getFileName());
			System.out.println();
		}
	}

}
