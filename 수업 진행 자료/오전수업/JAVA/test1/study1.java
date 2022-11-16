package test1;

import java.util.Arrays;
import java.util.Scanner; //빨간줄 마우스 오버 시 import 있음

//import java.util.Scanner;

public class study1 {
	
	public static void main(String[] ars) {
		
		Scanner sc = new Scanner(System.in);
		
		// 클래스 - 사용자 정의 데이터 타입
		// 자바 기본 데이터 타입
		// 정수 타입 - byte , short , int , long;
		// 실수 타입 - float, double;
		// 문자 타입 - char;
		// 논리 타입 - boolean; 참, 거짓 표현
		
		/* int num;
		
		num = sc.nextInt();
		// nextFloat(); - float 타입
		byte b = sc.nextByte();
		short s = sc.nextShort();
		long l = sc.nextLong();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		boolean bool = sc.nextBoolean();
		char ch = sc.next(); // 그냥 sc.next() or sc.nextLine() or sc.nextLine().charAt(0);  적으면 문자열
		*/
		
		// 국어, 수학, 영어, 점수 입력 받아서 총점과 평균출력 하기
		
		
		/*
		int kor, mat, eng;
		
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();
		System.out.println("수학 점수 : ");
		mat = sc.nextInt();
		System.out.println("영어 점수 : ");
		eng = sc.nextInt();
		
		int total = kor + mat + eng;
		int avg = total / 3;
		
		System.out.println("총점 : " + total + " 평균 : " + avg);
		*/
		
		
		//배열
		//	const arr = []. const arr2 = new Array();
		
		//자바에서 1차원 배열생성하기
		//타입[] 배열이름 = new 타입[배열의크기];
		
		int[] score = new int[5];
		score[0]=10;
		score[1]=20;
		score[2]=30;
		score[3]=40;
		score[4]=50;
		
		System.out.println(score[0]);
		
		//입력값 전체 출력 for문
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		String[] name = new String[3];

		for(int i = 0; i < name.length; i++) {
			System.out.println("이름입력 : ");
			name[i] = sc.nextLine(); // sc.next();
		}
		// 입력한 문자열 출력
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		//Arrays. 배열에 사용 가능한 함수 목록
		
		// 배열 복사 함수
		int[]  temp = new int[10];
		// arraycopy( 복사할 배열 , 복사배열시작인덱스 몇번? , 저장되는 배열 , 저장배열 시작 인데스 몇번? , 갯수)
		System.arraycopy(score, 0, temp, 0, score.length);
		
		System.out.println(Arrays.toString(temp));
		
		
		
	}
}
