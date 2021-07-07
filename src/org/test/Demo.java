package org.test;

public class Demo {
	public static void tc1() {
		System.out.println("tc1");
	}

	public static void tc3() {
		System.out.println("tc2");
	}
	public static void main1(String[] args) {
		tc1();
		tc2();
	}

	public static void tc2() {
		System.out.println("tc2");
	}
	public static void main(String[] args) {
		tc1();
		tc2();
	}
}
