package com.ThreadPrograms;

public class ThreadNamePrintPrograms extends Thread {



	public static void main(String[] args) {
		
		ThreadNamePrintPrograms thread1 = new ThreadNamePrintPrograms();
		ThreadNamePrintPrograms thread2 = new ThreadNamePrintPrograms();
		ThreadNamePrintPrograms thread3 = new ThreadNamePrintPrograms();
		thread2.setPriority(MIN_PRIORITY);
		thread1.setPriority(MAX_PRIORITY);
		thread3.setPriority(NORM_PRIORITY);
		
		thread1.start();
		thread1.setName("Thread Number 1");
		System.out.println("Norm priority:" +thread1.getPriority());
		
		thread2.start();
		thread2.setName("Thread Number 2");
		System.out.println("Max priority:" +thread2.getPriority());
		
		thread3.start();
		thread3.setName("Thread Number 3");
		System.out.println("Min priority:" +thread3.getPriority());
			
	}

	 public void run() 
	 {
		
		System.out.println(Thread.currentThread().getName());
	 }

}
