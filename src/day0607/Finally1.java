package day0607;

public class Finally1 {
	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수 값이 부족합니다.");
			return; // 리턴이 있는 곳에서 실행이 중단됨
		} finally {
			System.out.println("다시 실행하세요 !");
		}
		
		// 보통 try문을 1개만 쓰고 2개이상 잘 쓰지 않음
		// -> 각각의 코드를 하나하나 다 써주어야 하기 때문에 합쳐서 사용
	}
}
