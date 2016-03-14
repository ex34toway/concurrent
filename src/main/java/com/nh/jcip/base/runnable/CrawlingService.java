package com.nh.jcip.base.runnable;

import java.net.URI;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.AbstractScheduledService;

public class CrawlingService extends AbstractScheduledService {

	private Set<URI> visited;
	private Queue<URI> toCrawl;

	protected void startUp() throws Exception {
		//toCrawl = readStartingUris();
	}

	@Override
	protected void runOneIteration() throws Exception {
		
	}

	@Override
	protected Scheduler scheduler() {
		return Scheduler.newFixedRateSchedule(0, 1, TimeUnit.SECONDS);
	}

}
