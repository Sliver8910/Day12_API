package com.ruda.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력");
		int age = 0;
		try {
		age = sc.nextInt();
		ArrayList<String> ar = new ArrayList<String>();
		String str =null;
		
		age = 5/age;
		System.out.println(ar.get(1));
		System.out.println(str.length());
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("숫자만 입력하세요");
			
		}
	
		System.out.println("Age : "+age);

	}

}
