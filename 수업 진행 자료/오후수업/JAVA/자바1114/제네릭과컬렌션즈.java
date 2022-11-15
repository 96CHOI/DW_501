package 자바1114;

import java.util.ArrayList;
import java.util.List;

public class 제네릭과컬렌션즈 {

	public static void main(String[] args) {
	
		//컬렉션즈 : 자료구조 (스택, 힙, 맵, 셋....)
		
		//배열
		int[] array = {5,7,6,10}; //배열 사용하는 방법 1
		int[] array2 = new int[4]; //배열 사용하는 방법 2
		
		System.out.println("배열 0번째 값 : "+ array[0]); //배열 호출하는 방법
		System.out.println("배열 0번째 값 : "+ array[1]);
		
		//List
		// <> : 제네릭
		// List : 컬렉션즈
		List<Integer> list = new ArrayList<Integer>(); // 정수형을 담는 리스트
		list.add(10); //** 중요 add
		list.add(20);
		System.out.println("0번째 값 : " + list.get(0)); //list 호출하는 방법 ** 중요 get
		System.out.println("0번째 값 : " + list.get(1)); 
		//List 길이 출력
		System.out.println("list 길이 값 : " + list.size());
		list.remove(1);// 1번째 요소 삭제 ** 중요 remove
		System.out.println("list 길이 값 : " + list.size());
		
		//문제 5의 배수를 출력하시오.
		//List 안에는 클래스만 올 수 있따 (Integer)
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(7);
		numberList.add(13);
		numberList.add(15);
		//1번째 방법
		for (int i = 0; i < numberList.size(); i++) {
			if(numberList.get(i) % 5 == 0) {
				System.out.println("for : " + numberList.get(i));
			}
		}
		
		//2번째 방법(향상된 for문(혹은 for each문 이라고 함) 을 이용한 로직 구현)
		//for문에서 길이만큼 알아서 i에 요소를 대입함.
		for (int i : numberList) {
			if(i % 5 == 0) {
				System.out.println("for each : " + i);
			}
		}
		
		numberList = new ArrayList<Integer>();
		list.add(50);
		list.add(100);
		list.add(300);
		list.add(99);
		//문제 numberList안에 있는 요소 총합 구하고, 100 이상인 요소가 몇개인지도 출력하기
		//for-each문으로 풀기
		
		int count = 0; // 100이상인 요소가 몇개인지 체크
		int sum = 0; // 총합 구하는 변수
		for(int i : list) {
			sum += i;
			if(i >= 100) {
				count++;
			}
		}
		System.out.printf("요소 총합: " + sum+ "\n100 이상 요소 : " + count + "개 \n");

		//문자를 담은 List
		List<String> wordList = new ArrayList<String>();
		wordList.add("아이스아메리카노");
		wordList.add("카페라떼");
		wordList.add("카페모카");
		wordList.add("아이스아메리카노");
		wordList.add("아이스아메리카노");
		wordList.add("아이스아메리카노");
		
		int count2 = 0;
		for(String item : wordList) {
			System.out.println(item);
			//자바에서 문자비교는 equals!!!
			if(item.equals("아이스아메리카노")) {
				count2++;
			}
		}
		
		System.out.println(count2 + " 개");
		
		버거킹 골드와퍼 = new 버거킹();
		골드와퍼.버거종류 = "치즈버거종류";
		골드와퍼.버거가격 = 9000;
		
		버거킹 블랙와퍼 = new 버거킹();
		블랙와퍼.버거종류 = "프리미엄종류";
		블랙와퍼.버거가격 = 12000;
		
		//버거킹 클래스를 담는 list
		List<버거킹> 버거킹선화점 = new ArrayList<버거킹>();
		버거킹선화점.add(골드와퍼);
		버거킹선화점.add(블랙와퍼);
		
		//문제 버거킹 선화점에 있는 모든 메뉴를 출력하시오.
		
		for(버거킹 선화점 : 버거킹선화점) {
			System.out.println(선화점.버거종류);
		}
				
				
				
				
		
	}
}