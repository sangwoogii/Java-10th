package day0607;

class CarException extends Exception { // 예외를 처리하기 위한 클래스 생성
	
}

class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0d;
		
		System.out.println("자동차를 만들었어요 !");
	}
	
	public void setCar(int num, double gas) throws CarException {
		
		if (gas < 0) {
			CarException c = new CarException();
			throw c;
		} else {
			this.num = num;
			this.gas = gas;
			System.out.println("차량번호 : " + num + ", 연료량 : " + gas);
		}
	}
	
	public void show() {
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
}

public class Throws3 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		try {
			car1.setCar(1234, -10.0);
		} catch (CarException e) {
			System.out.println(e + "가 발생했어요.");
		}
		
		car1.show();
		

	}

}
