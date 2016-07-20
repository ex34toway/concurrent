package com.nh.concurrent;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.common.collect.Maps;

public class CyclicBarrierTest2 {
	public static void main(String[] args) {
		final Map<String, Integer> mapCount = Maps.newHashMap();
		final Random random = new Random();
		ExecutorService exec = Executors.newFixedThreadPool(4);
		
	}
}
