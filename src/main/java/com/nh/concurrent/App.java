package com.nh.concurrent;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class App {
	public static void main(
			String[] args) {
		final ConcurrentHashMap<String, Integer> conMap = new ConcurrentHashMap<String, Integer>();
		ListeningExecutorService exec1 = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
		final ListenableFuture<Integer> listenFuture = exec1.submit(new Callable<Integer>() {
			public Integer call() throws Exception {
				return 1;
			}
		});
		listenFuture.isDone();
		Futures.addCallback(listenFuture, new FutureCallback<Integer>() {
			public void onSuccess(Integer result) {
				conMap.put("liliang", 1);
			}

			public void onFailure(Throwable t) {
				t.printStackTrace();
			}
		});
		exec1.shutdown();

		for (Map.Entry<String, Integer> enty : conMap.entrySet()) {
			System.out.println(enty.getKey() + "-->" + enty.getValue());
		}
	}
}
