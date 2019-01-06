package com.abb.test;

public class Test {

	public static void main(String args[]) {
		
		int totalPage = 50;
		
		for(int i=0;i<=totalPage;i++) {
			System.out.println(i);
		}
		while(true) {
			if(totalPage == 100) {
				break;
			}
			totalPage++;
		}
		System.out.println(totalPage);
	}

}
