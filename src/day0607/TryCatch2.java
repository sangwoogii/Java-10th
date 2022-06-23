package day0607;

public class TryCatch2 {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0]; // 위의 String[] args를 가지고 예외처리를 하려함
			String data2 = args[1];
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수의 값이 없습니다.");
		}
		

		// 만약 예외가 발생하면 "매개변수 값이 없습니다."라고 출력
		
		// 예외처리를 하고 값을 넣을 땐 오른쪽마우스 -> Run as -> Run confi~ -> arguments에 값 작성
		// String[] args에 대한 내용이기 때문에 값을 하나 작성하고 띄우면 배열의 0번째부터 값이 지정된다는 의미
		
//		try {
//			String data1 = args[0];
//			String data2 = args[1];
//			System.out.println("args[0] : " + data1);
//			System.out.println("args[1] : " + data2);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// 예외의 매개변수는 사용하기 위해 매개변수 선언 -> 뒷 내용에 나옴
//			System.out.println("매개변수 값이 없습니다.");
//		}
	}

}
