package day0607;

public class Throw {

	public static void main(String[] args) {
		
		// 예외를 고의로 발생시키기 위해선 -> Throw라는 코드 사용
		// 예외를 고의로 발생시키기 위해선 try에 예외를 만들어야함
		
		try {
			System.out.println("출력");
			Exception e = new Exception("고의로 예외 발생"); // 객체생성
			throw e; // e의 내용을 던지기 (불러옴)
			// '출력'까지는 정상적으로 출력이되고 e의 내용을 던져줌
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace(); // 오류를 보다 더 정확하게 확인 할 수 있음
		}
		
		// 위랑 밑이랑 같음
		
		try {
			throw new Exception();
		} catch (Exception e) {
			
		}

	}

}
