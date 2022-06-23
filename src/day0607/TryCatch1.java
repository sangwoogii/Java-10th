package day0607;

public class TryCatch1 {

	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("데이터가 공백입니다.");
		}
		
		
		// System.out.println(data.toString());
		// 그냥 data로만 출력하면 주소값이 나옴
		// String 자료형은 객체를 출력할 때 toStirng 사용
		
		

	}

}
