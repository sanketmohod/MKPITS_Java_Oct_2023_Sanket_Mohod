
package com.mkpits.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationForThreadPool {

	public static void main(String[] args) {

		ExecutorService executer = Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++) {
			Runnable worker = new MyWorkerThread(" task  "+i);
			executer.execute(worker);
		}
		executer.shutdown();
	
		while(!executer.isTerminated()) {}
		System.out.println("Finished all threads");
		
	}

}
