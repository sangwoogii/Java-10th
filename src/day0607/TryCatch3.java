package day0607;

public class TryCatch3 {

	public static void main(String[] args) {
		
		// 1. 문자를 숫자로 변환해주는 코드를 사용
//		String data1 = "100";
//		String data2 = "11";
//		
//		// String data1 = "100"을 숫자로 바꿔주기위함
//		// 문자를 숫자로 바꿔주는 코드 : Integer.parseInt(String타입);
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//		
//		int result = value1 + value2;
//		
//		System.out.printf("%d + %d = %d", value1, value2, result);
		
		
		
		// 2. data2에 문자도 같이 넣고 출력하면 오류가 발생 -> 예외처리 
//		try {
//		String data1 = "100";
//		String data2 = "aa11";
//		
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//		
//		int result = value1 + value2;
//		
//		System.out.printf("%d + %d = %d", value1, value2, result);
//		} catch (NumberFormatException e) {
//			System.out.println("문자는 숫자로 변환할 수 없습니다.");
//		}
		
		
		
		
		// 3. result 1개 더 추가
		try {
			String data1 = "100";
			String data2 = "aa";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result2 = value1 / value2;
			System.out.printf("%d + %d = %d", value1, value2, result2);
			
			int result = value1 + value2;
			System.out.printf("%d / %d = %d", value1, value2, result);
			
			// | 를 쓰면 예외를 하나더 추가 가능함 -> 멀티 캐치문
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("문자는 숫자로 변환할 수 없습니다.");
//				System.out.println(e.getMessage());
				
				e.printStackTrace();
			}
		
		// 멀티 catch문 주의할 점
		// 1. 부모와 자식 관계는 불가능
		// 2. catch문에서 메서드를 호출할 경우에는 하나의 예외에서만 가지고 있는 메서드를 호출하면 안됨
	}

}
