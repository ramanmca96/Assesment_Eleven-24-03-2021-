package com.ThreadPrograms;

public class ThreadSleepaPrograms extends Thread {

		public static void main(String[] args) {
			ThreadSleepaPrograms Thread1 = new  ThreadSleepaPrograms();
			ThreadSleepaPrograms Thread2 = new  ThreadSleepaPrograms();
			ThreadSleepaPrograms Thread3 = new  ThreadSleepaPrograms();
			 
			Thread1.start();
			
				
			try {
				Thread1.join();
			 }catch(Exception e) {
				 System.out.println(e);
			 }
			
			Thread2.start();
			Thread3.start();
			
			
		}
		public void run() {
			for(int i=1; i<5; i++) {
				try {
					Thread.sleep(500);
					}
				catch(InterruptedException e) {
					System.out.println(e);}
				System.out.println(i);
			}
}
}