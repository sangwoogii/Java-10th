package day0607;

public class Throws2 {

	// 예외를 처리한 후에 다시 인위적으로 예외를 발생시키는 것을
	// 예외 되던지기 라고 함.
	
	// 예외 되던지기의 주의할 점.
	// 예외 발생한 메서드에서는 try-catch문을 이용하여 예외를 처리하고
	// 메서드 선언부에서는 새로 발생할 예외를 throws에 지정해야함.
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외를 처리함");
		}
		
	}
	
	static void method1() throws Exception { // 객체생성을 하지 않고 출력하기 위해 static 사용함
		try {
			throw new Exception(); // 예외를 강제로 발생
		} catch (Exception e) {
			System.out.println("method1()에서 예외를 처리함");
			throw e; // 예외 되던지기
		}
		
	}

}
