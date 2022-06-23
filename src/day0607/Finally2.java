package day0607;

public class Finally2 {
	
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		
		method(true);
		System.out.println();
		method(false);
		
		// 메인먼저 실행 -> 1 -> if가 true일때 던져라 (Arith~ 는 Runtime에 상속) -> 3 -> finally는 리턴이 있어도 값이 출력됨
		// 값이 출력되고 return으로 인해 코드 종료

	}

}
