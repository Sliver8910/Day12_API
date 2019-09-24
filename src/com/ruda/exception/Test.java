package com.ruda.exception;

import java.util.Scanner;

public class Test {
	
	
	public void t1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		num=100/num;
		
		System.out.println(num);
		
	}

}
