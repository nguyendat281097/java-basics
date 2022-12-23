package com.nvd.training.designpatterns.behavioral.observer;

import com.nvd.training.designpatterns.behavioral.observer.notifiers.AbstractObserver;
import com.nvd.training.designpatterns.behavioral.observer.notifiers.EmailNotifier;
import com.nvd.training.designpatterns.behavioral.observer.notifiers.FacebookNotifier;
import com.nvd.training.designpatterns.behavioral.observer.notifiers.PhoneNumberNotifier;
import com.nvd.training.designpatterns.behavioral.observer.notifiers.YoutubeNotifier;

public class TestObserver {
	public static void main(String[] args) {
		VideoData video = new VideoData();

		new EmailNotifier(video);
		new YoutubeNotifier(video);
		AbstractObserver phoneNumber = new PhoneNumberNotifier(video);
		
		video.setTitle("This is Observer Design Pattern");
		
		System.out.println("------------------------");
		video.detachObserver(phoneNumber);
		video.setDescription("This is a description for Observer Design Pattern");
		
		System.out.println("------------------------");
		new FacebookNotifier(video);
		video.setFileName("This is the file name");
	}

}
