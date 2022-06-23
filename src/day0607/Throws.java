package day0607;

public class Throws {
	
	public static void main(String[] args) { // throws Exception 
		try {
			method1();	
		} catch (Exception e) {
			System.out.println("예외");
		}
		
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception(); // 예외 발생
	}
	
	
	
	
	
//	public static void main(String[] args) throws Exception { 
//			method1();	
//	}
//	
//	
//	static void method1() throws Exception {
//		method2();
//	}
//	
//	static void method2() throws Exception {
//		throw new Exception(); // 예외 발생
//	}
	
}
