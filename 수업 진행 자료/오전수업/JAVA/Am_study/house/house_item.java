package house;

public abstract class house_item {
	public String brand;
	public int price;
	
	public house_item() {//생성자 메서드 실행은 반드시 메서드 명으로 실행이 되어야함.

	}
	
	public house_item(String brand, int price) {
		this.brand = brand;
		this.price = price; //this는 현재 생성되는 객체이다.
	}
	
	@Override
	public String toString() {
		return "브랜드 : " + brand + "	금액 : " + price + "원";
	}
	
	// 내용은 필요없으나 메서드는 필요함.
	// 부모가 있어야 자식들이 사용 가능함.
	// 형태만 가지고 있음. 세부적인 내용은 자식 클래스에서 설정.
	public abstract void buy(); //**추상메서드 - Spring에서 많이 함.
	// 추상 메서드를 가진 클래스는 반드시 추상 클래스가 되어야 한다.
	// abstract
}
/*
 * 추상클래스는 추상메서드를 가질 수 있다.
 * 추상클래스는 객체 생성이 불가능하다.
 * 추상메서드는 상속이 된다. (자식 클래스는 추상 메서드를 가지게 된다.)
 * 
 * 추상화를 하는 이유
 * 클래스의 중복성을 제거
 * 가독성 증가
 * 에러율 감소
 * 유지보수 시간 단축
 * 
 * 
 * */














//public house_item() {//생성자 메서드 실행은 반드시 메서드 명으로 실행이 되어야함.
//	onoff = false;
//}

//	public void power() {
//		onoff = !onoff;
//		if(onoff)
//			System.out.println("전원 on");
//		else
//			System.out.println("전원 off");
//	}