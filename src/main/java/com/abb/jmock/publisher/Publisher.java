package com.abb.jmock.publisher;

import com.abb.jmock.subscribe.Subscriber;

public class Publisher {
	
	private Subscriber subscriber;

	public void add(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	
	public void  publish(String message) {
		System.out.println(message);
	}
}
