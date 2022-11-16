package test1;

public class member {
	// 클래스 변수 - 변수 앞에 클래스 이름이 붙어있음.
	// 생성 : 프로그램 로드
	// 종료 : 프로그램 종료
	static int count;
	
	// 인스턴스 변수 - 클래스 내부에서 만들어진 변수
	// 해당 프로그램에서 해당 이름으로 유일하게 하나만 있음. 객체 개수의 상관없이
	// 생성 : 클래스 객체 생성시
	// 종료 : 클래스 객체 종료시
	public String 아이디;
	public String 이름;
	public String 주소;
	public String 성별;
	
	public member() {} //생성자 메서드
	public member(String 아이디, String 이름, String 주소, String 성별) {
		this.성별 = 성별;
		this.아이디 = 아이디;
		this.이름 = 이름;
		this.주소 = 주소;
	}
	
	public void output() {
		
		System.out.println("아이디 : " + 아이디 + "\n이름 : " + 이름 + "\n주소: " + 주소 + "\n성별 : " + 성별);
	}
}
