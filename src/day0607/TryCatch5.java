package day0607;

public class TryCatch5 {

	public static void main(String[] args) {
		
		// 정수형 3칸짜리 arr 배열을 만든 뒤
		// 순서대로 1, 2, 3의 값을 입력한다.
		// 0부터 4번 인덱스까지 출력하도록 for문을 작성한 다음
		// 예외 발생 시 '인덱스 범위가 벗어났습니다.' 를 출력하여 이를 예외처리 하시오.
		
		
		int [] arr = new int [3];
		 
		try {
			for (int i=0; i<=3; i++) {
				arr[i] = i+1;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("인덱스 범위가 벗어났습니다.");
		}
		
		
		
//		int i;
//		int [] arr = new int [3];
//		String str = null;
//		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		
//		try {
//			for (i=0; i<3; i++) {
//				arr[i] = i+1;
//			}
//			
//			for (i=0; i<4; i++) {
//				System.out.println(arr[i]);
//			}
//			
//			i = 4 / 0;
////			i = 4 / 4;
//			str.charAt(i);
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException 예외 발생");
//			System.out.println(e); // 예외 이름만 작성해도 자동적으로 오버라이딩해줌
////			System.out.println(e.getMessage()); // 어떤 예외가 발생했는지 자세하게 알려주는 코드
////			e.printStackTrace(); // 어떤 예외가 발생했는지 자세하게 알려주는 코드, getMessage보다 더 자세함
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException 예외 발생");
//		} catch (Exception e) {
//			System.out.println("예외 타입의 최고 조상인 Exception을 처리");
//		} finally {
//			System.out.println("예외 발생 시 무조건 실행");
//		}
		
		// 예외를 먼저 만나면 그 다음에 있는 예외는 실행되지 않음
		
//		try {
//			for (int i=0; i<arr.length+1; i++) {
//				System.out.println(arr[i]);
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위가 벗어났습니다.");
//		}
	}

}
