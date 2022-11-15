package 자바0927;

class A { // A클래스 시작
	int value; // value 탄생 (필드 변수)
	//필드 변수 특징
	//1. 전역(전체)으로 활용 가능
	//2. 초기값을 지정하지 않아도 된다. 기본 값(default 값)이 존재
	public void 확인하기 () {
		int x = 50; // x라는 이름을 가진 변수 탄생
		int y; //y에 값이 없어서 y를 출력 혹은 사용 시 오류 발생.
		System.out.println("A클래스에 있는 메소드 입니다");
		System.out.println(value);
	}// x 생을 마감.
	
} // A클래스 끝 => value 생을 마감.

class B { // B클래스 시작
	public void 확인하기 () { // 메소드 시작
		System.out.println("B클래스에 있는 메소드 입니다.");
	} // 메소드 끝
} // B클래스 끝

class C {
	//필드변수
	String str;
	int value;
	//리턴 타입이 있으면 리턴을 꼭 써주자~!
	//접근제어자 public static 사실 optional(선택) 이다.
	boolean 메소드만들기 () {
		//true or false를 리턴
		return true;
	}
	int 메소드만들기(double x, double y) {
		return 0;
	}
	//class B를 리턴하겠다.
	B 메소드만들기(B b) {
		return b;
	}
}

public class Home {
	//static 메소드는 static 메소드 혹은 인스턴스화 된 메소드만 올 수 있다.
	public static void main(String[] args) {
		A a클래스 = new A(); // newA() => A클래스를 호출하다.
		a클래스.확인하기(); //a클래스에 있는 확인하기 메소드 (==함수) 사용
		B b클래스 = new B();
		b클래스.확인하기();
		C c클래스 = new C();
		c클래스.메소드만들기();
	}
}
