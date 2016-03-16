package com.nh.concurrent;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.common.collect.Maps;

public class CyclicBarrierTest2 {
	public static void main(String[] args) {
		final Map<String, Integer> mapCount = Maps.newHashMap();
		final Random random = new Random();
		ExecutorService exec = Executors.newCachedThreadPool();

		final CyclicBarrier barrier = new CyclicBarrier(4, new Runnable() {
			@Override
			public void run() {
				System.out.println("ok");
			}
		});

		exec.execute(new Runnable() {
			@Override
			public void run() {
				mapCount.put("1", random.nextInt(1000));
			}
		});
		exec.execute(new Runnable() {
			@Override
			public void run() {
				mapCount.put("2", random.nextInt(1000));
			}
		});
		exec.execute(new Runnable() {
			@Override
			public void run() {
				mapCount.put("3", random.nextInt(1000));
			}
		});
		exec.execute(new Runnable() {
			@Override
			public void run() {
				mapCount.put("4", random.nextInt(1000));
				try {
					barrier.await();
					for (Map.Entry<String, Integer> entry : mapCount.entrySet()) {
						System.out.println(entry.getKey() + " --> " + entry.getValue());
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			}
		});
		exec.shutdown();
	}
}
