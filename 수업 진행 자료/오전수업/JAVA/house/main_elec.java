package house;

import java.util.List;

// static : 정적 공간 - 프로그램 시작 시 할당 
// instance : 동적 공간 - 프로그램 실행 중 할당

// 인스턴스(시작 후 실행 중 할당) 와 스태틱(시작과 동시)은 생성 시간이 다르기 때문에 스태틱에 인스턴스를 사용 불가
// 반대로 인스턴스에 스태틱을 사용해야 함.

// 클래스는 아파트설계도 (추상적) 개념
// 객체는 완성된 아파트 개념

public class main_elec {

	static List<house_item> list = null;
	public static void init() {
		file f = new file("c:/test/electronic.txt");
		
		list = f.load();
		
	}

	public static void main(String[] args) {
		init();
		
		for (house_item item : list)
			System.out.println( item.toString() );

	}

}

// static 메서드에서 사용가능 한것
//		-> static메서드, static 변수
//
// instance(인스턴스) 메서드에서 사용가능 한것
//		-> 인스턴스메서드, 인스턴스변수, static변수, static 메서드

// 실체화 하여 실행 할 것인가, 실체화 하지 않고 호출할 것인ㄱ?
// 아파트를 건설 하기 위해 설계도를 작성한다. -> 클래스 구현
// 아파트를 분양하기 위해 모델하우스를 짓는다. -> static은 클래스 객체생성 하지 않아도 사용가능
// 설계도를 보고 아파트를 짓는다. -> 인스턴스는 클래스 객체생성 해야 사용가능

// 인스턴스 메서드는 인스턴스가 생성 되어야 호출이 가능함.
// 그렇게 호출이 되도록 코드로 구별을 해주었고 그렇게 동작하도록 자바 머신에서 인식하기 때문.
// jvm - 자바가상머신










