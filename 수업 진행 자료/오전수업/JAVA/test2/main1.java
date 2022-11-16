package test2;

import java.util.ArrayList;
import java.util.List;

import test1.member;


public class main1 {
	
	public static void main(String[] args) {
		//member[] arr = new member[5];
		
		List<member> list = new ArrayList<>();
		
		list.add(new member());
		list.get(0).성별="남자";
		list.get(0).아이디="end";
		
		/*
		// int[] a = new int[10];
		
		member[] arr = new member[5];
		//클래스타입의 배열 생성하면 배열의 각 공간은 클래스타입의 찹조변수 공간이다.
		//참조 변수만 있을 뿐 public을 붙여줘야한다.
		
//		arr[0] = new member();
//		arr[0].아이디 = "li";
//		arr[0].성별 = "여자";
//		arr[0].주소 = "대전 서구 둔산동";
//		arr[0].이름 = "윤재영";
		
		// for문 1번
//		for (int i = 0; i < arr.length; i++)
			
		Scanner sc = new Scanner(System.in);
		
		// for문 2번, 배열을 사용할 때 사용하는 for문
//		for (member temp : arr) {
//			temp = new member();
//			System.out.println("아이디 : ");
//			temp.아이디 = sc.nextLine();
//			System.out.println("이름 : ");
//			temp.이름 = sc.nextLine();
//			System.out.println("주소 : ");
//			temp.주소 = sc.nextLine();
//			System.out.println("성별 : ");
//			temp.성별 = sc.nextLine();
//		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new member();
			System.out.println("아이디 : ");
			arr[i].아이디 = sc.nextLine();
			System.out.println("이름 : ");
			arr[i].이름 = sc.nextLine();
			System.out.println("주소 : ");
			arr[i].주소 = sc.nextLine();
			System.out.println("성별 : ");
			arr[i].성별 = sc.nextLine();
		}
	
		for ( member temp : arr)
			temp.output();
		
		
		
		//final int a = 10;
		//a = 20;
		 */
		
	}
	
}

// 지역변수
// 생성: 선언{ 시작시 생성 
// 종료: } 종료시 종료

//클래스 변수 - 변수 앞에 클래스 이름이 붙어있음.
// 생성 : 프로그램 로드
// 종료 : 프로그램 종료

//인스턴스 변수 - 클래스 내부에서 만들어진 변수
// 해당 프로그램에서 해당 이름으로 유일하게 하나만 있음. 객체 개수의 상관없이
// 생성 : 클래스 객체 생성시
// 종료 : 클래스 객체 종료시

// 제어자
/*
 * final - 변경할 수 없는
 * static - 클래스의.... 공통적인
 * 
 * 		static 변수
 * 			-모든 인스턴스에 공통적으로 사용되는 클래스 변수
 * 			-모든 클래스 변수는 인스턴스를 생성하지 않고도 사용가능
 * 			 new 연산자 사용하지 않아도 사용 가능.
 * 			-클래스가 메모리에 로드될 때 생성된다.
 * 		static 메서드
 * 			-인스턴스를 생성하지 않고도 호출이 가능한 static 메서드
 * 	**중요	-static메서드에서는 인스턴스 변수와 인스턴스 메서드 사용불가
 * 
 * abstarct - 추상적인, 추상화작업
 * 
 * 접근 제어자
 * 	   public - 제한 없이 사용가능, 클래스, 변수, 메서드
 * 	   default - 같은 패키지에서만 사용가능
 * 	   protected - 같은 패키지에서만 사용가능, but 상속인 경우 예외
 * 	   private - 같은패키지라도 사용불가, 누구든 사용불가, 오직 해당 클래스 내부에서만 사용 가능
 * 
 */















