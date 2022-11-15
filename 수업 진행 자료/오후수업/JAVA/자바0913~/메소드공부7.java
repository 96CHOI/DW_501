package 자바0913;

public class 메소드공부7 {

	//boolean (true or false만 가능)
	/*
	 * public static : 접근 지정자
	 * int : 리턴타입
	 * getNum : 메소드 이름
	 * int x, String y : 파라미터 타입
	 * */
	public static int getNum(int x, String y) { // 파라미터안에는 모든 데이터 타입 가능!
		return 0;
	}
	//문제1. 아래 메소드 main메소드에 호출해서 결과 확인하기!
	public static int getNum(int x, String y, String z) {
		return 10;
	}
	/* 문제2. 메소드 만들기 -> main 함수에 호출 하시오!~
	 * 접근지정자 : public static
	 * 리턴 타입 : boolean
	 * 메소드이름 : isTrue
	 * 파라미터 : boolean, String
	 * */
	public static boolean isTrue(boolean x, String y) {
		return false;
	}
	
	public static String getStr() {
		return "피자빵";
	}
	
	//main 메소드 호출하고 결과 확인하기!
	public static int 피자빵주세요(int 빵) {
		return 빵;
	}
	
	//main 메소드 호출하고 결과 확인하기!
	public static int 돈을인출하다(int 돈) {
		return 3000;
	}
	//메소드 이름이 같으나 파라미터 타입, 개수가 다르면 메소드 이름 중복 사용가능(==오버로딩)
	public static int 돈을인출하다(int 돈, String 계좌) {
		if(계좌.equals("카카오뱅크")) { //.equals : 문자 비교
			return 돈;
		}
		if(계좌.equals("농협")) {
			return 돈;
		}
		return 0;
	}
	
	public static int 돈을해외로송금하다(int 금액, String 해외) {
		if(해외.equals("수리남")) {
			return 500;
		}
		return 금액;
	}
	
	public static int 섯다패를돌리다(String 결과) {
		if(결과.equals("장땡")) {
			return 500;
		}
		if(결과.equals("38")) {
			return 1000;
		}
		return 0;
	}
	
	public static boolean 말해YesOrNo(String 가수) {
		if("지코".equals(가수)) {
			return true;
		}
		if("지코".equals("지코")) {
			return false;
		}
		return true;
	}
	
	public static String 나는가수다() {
		if(1 != 1) {
			return "뉴진스";
		}
		if(1 == 1) {
			return "아이브";
		}
		return "여자아이들";
	}
	
	public static void 무한도전(String 멤버이름) {
		if(멤버이름.equals("박명수")) {
			System.out.println("Hello");
		}
		if(5 == 5) {
			System.out.println("Hello");
		}
	}
	public static int 용돈을드리다(int 용돈금액 , String 가족) {
		가족 = "아빠";
		if(가족.equals("엄마")) {
			return 용돈금액;
		}
		가족 = "엄마";
		if(가족.equals("아빠")) {
			return 용돈금액;
		}
		return 1000;
	}
	public static void main(String[] args) {
		int x = getNum(10, "붕어빵"); // 메소드 호출
		//메소드에 리턴이 있으면 대입이 가능하다.
		System.out.println("결과 => " + x);
		int y = getNum(10, "윤재영", "자식");
		System.out.println("결과 => " + y);
		boolean q = isTrue(true,"금요일");
		System.out.println("결과 => " + q);
		String word = getStr();
		System.out.println("결과 => " + word);
		int 빵 = 피자빵주세요(100);
		System.out.println("결과 => " + 빵);
		int money = 돈을인출하다(500);
		System.out.println("결과 => " + money);
		int 돈 = 돈을인출하다(3000, "카카오뱅크");
		System.out.println("결과 => " + 돈);
		int 금액 = 돈을해외로송금하다(300, "이탈리아");
		System.out.println("결과 => " + 금액);
		int 패 = 섯다패를돌리다("39");
		System.out.println("결과 => " + 패);
		boolean 가수 = 말해YesOrNo("지코바");
		System.out.println("결과 => " + 가수);
		int 용돈 = 용돈을드리다(300, "엄마");
		System.out.println("결과 => " + 용돈);
	}

}
