package cafe.control;

@FunctionalInterface
public interface menu_able {
	
	public boolean menu_active();
	
	/*
//	int num;// 인스턴스 변수 불가능
	final int count = 20; //상수가능
	static int day = 10; //클래스 변수 가능
	
	public abstract void sum(); // 추상 메서드
	
//	void sum() {// 인스턴스 메서드 불가능}
	
	static void addd() { //클래스 메서드는 가능.
		
	}
	*/
}


// 인터페이스 - 추상클래스의 하나이다.
// 추상클래스는 추상메서드를 가지고 있는 클래스이다.
// 추상클래스는 객체 생성에 제한이 있다.
// 고로 인터페이스는 추상메서드를 가지며, 객체 생성에 제한이 있다.
// 인터페이스에 정의 하는 메서드는 기본적으로 추상메서로 정의 된다.
// 인터페이스에는 인스턴스변수, 인스턴스메서드스 정의 불가
// final을 사용한 상수, static을 사용한 클래스 변수 + 클래스 메서드는 사용가능.
// 인터페이스에 추상메서드 정의는 abstract 생략할 수 있다.
// 인터페이스에 추상메서드가 하나만 있다면 해당 인터페이스를 함수형 인터페이스라고 한다.
// 함수형 인터페이스는 *람다* 생성할 때 사용할 수 있는 인터페이스이다.








