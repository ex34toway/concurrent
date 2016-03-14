package com.nh.base.task;

import java.util.Timer;

public class OneOffScheduling {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new HelloWorldTask(), 1000,500);
	}
}
