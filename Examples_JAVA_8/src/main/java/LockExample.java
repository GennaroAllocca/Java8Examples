package main.java;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lock lock = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		try {
		lock.lock();
		lock2.lock();
		int a = 10 % 2 +1;
		int _million = 1_000_000;
		double hundred = 100;
		short s = 1;
		
		//Locale.setDefault(Locale.GERMANY);
		DecimalFormat df = new DecimalFormat("#00.00##");
		double pi = 3.141592653;
		System.out.println(df.format(pi));
		
		DecimalFormat dfi = new DecimalFormat("#,00000.0#");
		double pii = 333.141592653;
		System.out.println(dfi.format(pii));
		

		

		} finally {
		lock.unlock();
		}
		new Thread(() -> {
		if(lock.tryLock()) {
		try {
		System.out.println("Acquired");
		} finally {
		lock.unlock();
		}
		} else {
		System.out.println("Unavailable");
		}
		}).start();

	}

}
