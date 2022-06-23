package day0607;

import java.io.IOException;

public class TryCatch4 {

	public static void main(String[] args) {
		
		int ch = 0;
		try {
			while ((ch = System.in.read()) != '\n') {
				// 사용자가 입력하는 내용을 받게됨
				// 엔터키 (줄바꿈)와 같지 않을 때
				// read() 는 메서드로 1byte씩 값을 읽어옴
				// System.in은 내 (사용자)가 값을 직접 입력하도록 설정하는 코드 = Scanner와 비슷함
				System.out.println((char)ch);
			}  
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
