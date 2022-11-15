package 자바0913;

import java.util.Scanner;

public class 자바기초2 {

	public static void main(String[] args) {
		// crtl + shift + o
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은 " + num);
		/*
		 문제 1번 : num에 값을 입력받았을 때 num을 x로 나눈 나머지가 1이 되도록
		 하는 가장 작은 자연수 x를 출력하시오.
		 ex) num이 10이라고 가정하면 가장 작은 자연수는 3입니다.
		 제한 사항 : num은 3 <= num <= 1000 입니다.
		 hint : while or for문을 이용해서 풀어보세요.
		*/
		
		int x = 0;
		if (num >=3 && num <= 1000) {
			for(x=1; x<=num; x++) {
				if(num % x == 1) {
					System.out.println("가장 작은 수 = " + x);
					break;
				}
			}
		}
		else {
			System.out.println("3 ~ 1000 사이의 숫자를 입력해주세요.");
		}
		
		/*
		 문제 2번 : 3부터 6까지 숫자 총합을 구하시오. (for문으로)
		 3 + 4 + 5 + 6 = 18
		*/
		int i = 0;
		int y = 0;
		for ( i=3; i<7; i++) {
			y += i;
		}
		System.out.println("최종 값은 => " + y);
	}

}
