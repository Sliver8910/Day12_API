package com.ruda.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class WeatherService {

	public HashMap<String, Weather> init() {
		//날씨 정보 초기화
		//weatherInfo.txt 읽어서
		//파싱, 객체를 모아서 리턴

		File file = new File("c:\\test","weatherInfo.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String str = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			boolean check = true;
			while(check) {
				str = br.readLine();
				if(str==null) {
					break;
				}
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		StringTokenizer st = new StringTokenizer(str, ",");
		HashMap<String, Weather> map = new HashMap<String, Weather>();
		while(st.hasMoreTokens()){
			Weather weather = new Weather();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble((st.nextToken())));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			map.put(weather.getCity(), weather);	
		}
		return map;
	}
}
