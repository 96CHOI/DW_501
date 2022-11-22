package house;

import java.util.List;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		init();
		buyer jyj = new buyer();

//		for (house_item item : list)
//			System.out.println( item.toString());

		// 1. tv 2. 에어컨 3. 컴퓨터 라는 선택할 수 있는 메뉴를 띄우고
		// 3개 중 하나를 선택하면 해당 제품들만 출력되게 만들기

		while (true) {
			System.out.println("1.TV  2.에어컨  3.컴퓨터 : ");
			int select = sc.nextInt();

			int i = 1;
			for (house_item item : list) {
				switch (select) {
				case 1:
					if (item instanceof tv)
						System.out.println(i + ". " + item.toString());
					break;
				case 2:
					if (item instanceof aircon)
						System.out.println(i + ". " + item.toString());
					break;
				case 3:
					if (item instanceof computer)
						System.out.println(i + ". " + item.toString());
					break;
				}
				i++;
			}

			boolean flag = false; // 구매 제품이 선택한 제품 종류 와 일치하는가?
			do {
				System.out.print("구매 할 제품 선택 (구매 X : 0) : ");
				int item_num = sc.nextInt();
				if (item_num == 0)
					continue;
				else {
					switch (select) {
					case 1:
						if (!(list.get(item_num - 1) instanceof tv))
							flag = true;
						break;
					case 2:
						if (!(list.get(item_num - 1) instanceof aircon))
							flag = true;
						break;
					case 3:
						if (!(list.get(item_num - 1) instanceof computer))
							flag = true;
						break;
					}
					if (flag)
						continue;
					jyj.buy(list.get(item_num - 1));
				}
			} while (flag);

			System.out.println("제품을 추가로 구매하시겠습니까? (1. 네, 2. 아니오) : ");
			int end = sc.nextInt();
			if(end == 0) break;

			// 1. TV제품 구매하려는데 제품번호가 TV가 아니라면 다시선택하게 만들기
			// 2. 제품 구매후에 추가로 구매할것인지 의사 물어보고 계속 구매, 구매 중지 하기 만들기
			// 3. 구매를 더 이상 하지 않는다면 지금까지 구매한 제품들 모두 출력하기
		}// 제품 구매 반복문
		
		jyj.buylist();

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
