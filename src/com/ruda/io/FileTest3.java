package com.ruda.io;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		File file = new File("c:\\test\\sub1");
		
		//String [] ar = file.list();
		File [] ar = file.listFiles(); //sub1 이하의 파일들을 객체를 만들어서 File 타입으로 가지고 옴
		
		for(int i =0; i<ar.length; i++) {
			System.out.println(ar[i]);
			ar[i].delete();
			//file = new File("c:\\test\\sub1\\"+ar[i]);
			//file.delete();
		}
		
	}

}
