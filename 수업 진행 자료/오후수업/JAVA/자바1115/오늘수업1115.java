package 자바1115;

//java.util 패키지 안에 들어있는 ArrayList라는 클래스를 사용하려면 import(불러오다) 해야함.
import java.util.ArrayList;
import java.util.List;

class Student{
	//필드변수
	String name;
	int height;
	//문제1. 필드변수에 값을 초기화할 수 있는 생성자를 만들기
	
	//*** 생성자란? 리턴타입이 없는 메소드 , 특징 : 메소드이름이 정해져 있음(클래스이름 같아야)
	
	Student(String name, int height){
		this.name = name;
		this.height = height;
	}
}

public class 오늘수업1115 {
	public static void main(String[] args) {
		
		// 문제2. 학생 클래스 3개 만들어서 아래 값 출력하기
		//이름 : 홍길동, 키 : 179
		//이름 : 김길동, 키 : 185
		//이름 : 이길동, 키 : 172
		
		Student a = new Student("홍길동",179);
		System.out.println("이름 : " + a.name + ", 키 : " + a.height + "cm");
		Student b = new Student("김길동",185);
		System.out.println("이름 : " + b.name + ", 키 : " + b.height + "cm");
		Student c = new Student("이길동",172);
		System.out.println("이름 : " + c.name + ", 키 : " + c.height + "cm");
		
		// 문제3. 학생클래스 ArrayList에 add하기
		List<Student> wordList = new ArrayList<Student>();
		wordList.add(a);
		wordList.add(b);
		wordList.add(c);
		
		//for문
		for (int i = 0; i < wordList.size(); i++) {
			System.out.println("이름 : " + wordList.get(i).name + ", 키 : " + wordList.get(i).height + "cm");
		}
		
		// 향상된 for문 (for-each)
		for(Student 학생 : wordList) {
		System.out.println("이름 : " + 학생.name + ", 키 : " + 학생.height + "cm");
		}
		
	}
}
