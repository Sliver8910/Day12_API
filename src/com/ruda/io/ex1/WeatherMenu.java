package com.ruda.io.ex1;

import java.util.HashMap;
import java.util.Scanner;

import com.ruda.collection.ex4.Weather;

public class WeatherMenu {

	public void Start() {
		//1. 날씨정보 초기화
		//2. 날씨정보 출력 weatherView view 호출
		//3. 날씨검색출력(도시명) weatherView view 호출
		//4. 날씨정보 추가
		//5. 날씨정보 삭제
		//6. 종료
		System.out.println("1. 날씨정보 초기화");
		System.out.println("2. 날씨정보 출력");
		System.out.println("3. 날씨검색출력(도시명)");
		System.out.println("4. 날씨정보 추가");
		System.out.println("5. 날씨정보 삭제");
		System.out.println("6. 종료");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		WeatherService ws = new WeatherService();
		
		switch (select) {
		case 1:
			
			
			
			break;
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;
		
		default:
			break;
		}
		
		
		
	}
}
