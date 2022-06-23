package day0607;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// 두 개의 정수를 입력받아 곱셈과 나눗셈의 연산결과를 출력
		// 입력값에서 정수가 아닌 값이 되면 예외가 발생하면서
		// 실행이 중단되는데 이를 예외 처리하여 실행되도록 구현하시오.
		
		int num1 = 0;
		int num2 = 0;
		int mul = 0;
		int div = 0;
		
			Scanner s = new Scanner(System.in);	
			System.out.println("두 개의 정수 입력 > ");
			try {
				num1 = s.nextInt();
				num2 = s.nextInt();
				mul = num1 * num2;
				div = num1 / num2;
				System.out.printf("%d * %d = %d %n", num1, num2, mul);
				System.out.printf("%d / %d = %d %n", num1, num2, div);
			} catch (InputMismatchException e) {
				System.out.println(e + "예외 발생");
			} catch (ArithmeticException e) {
				System.out.println(e + "예외 발생");
			} catch (Exception e) { // 코드 맨 마지막에 작성 왜 ?
				System.out.println("확인하세요.");
			} finally {
				s.close();
			}
				
	}
}
