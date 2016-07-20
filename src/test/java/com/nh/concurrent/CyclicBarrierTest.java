package com.nh.concurrent;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.common.collect.Maps;

public class CyclicBarrierTest {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		final Map<String, Integer> ret = Maps.newHashMap();
		final Random random = new Random();
		final CyclicBarrier barrier = new CyclicBarrier(4, new Runnable() {
			@Override
			public void run() {
				System.out.println("大家都到齐了，开始happy去");
			}
		});
		exec.execute(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(random.nextInt(1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + "到了，其他哥们呢");
				try {
					barrier.await();// 等待其他哥们
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
