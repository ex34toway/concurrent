package com.nh.concurrent.net.bean;

public class ChangeTypeTest {
	public static void main(String[] args) {
		ChangeType temp = ChangeType.valueOf(10);
		
		System.out.println(temp.toString());
	}
}
