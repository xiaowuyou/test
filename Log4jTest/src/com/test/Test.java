package com.test;

public class Test {
	public static void main(String args[]) {
		System.out.println("usage:");
		Test m = new Test();
		long t = m.showUsage();
		System.out.println("Total:" + t / 1024 / 1024 + "Bytes");
		long fr = m.freeMemory();
		// System.gc();
		System.out.println("Free:" + fr / 1024 / 1024 + "Bytes");
		long rem = t - fr;
		System.out.println("OccupiedSpace:" + rem / 1024 / 1024 + "Bytes");
	}

	public long freeMemory() {
		long f = Runtime.getRuntime().freeMemory();
		return (f);
	}

	public long showUsage() {
		long l = Runtime.getRuntime().totalMemory();
		return (l);
	}
}