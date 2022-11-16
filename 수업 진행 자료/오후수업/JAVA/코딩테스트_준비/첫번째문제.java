package 코딩테스트_준비;

public class 첫번째문제 {
	public static int 몇잔 (int x, int y) {
		return x / y;
	}
	
	public static int 커피 (int 가진돈, int 아메리카노) {
		return 가진돈 % 아메리카노; 
	}
	
	public static void main(String[] args) {
		//1. 민정이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
		//민정이가 가지고 있는 돈 money가 변수로 주어질 때, 민정이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을
		//순서대로 출력하는 로직을 구현하시오.
		
		int money = 15000; //가지고 있는 돈
		int 잔수 = 0;
		int 남은돈 = 0;
		final int AMERICANO = 5500;
		
		//방법 1(내가..)
		int 몇잔 = 몇잔(15000, 5500);
		System.out.println("몇잔? : " + 몇잔 + "잔");
		int 남는돈 = 커피(15000, 5500);
		System.out.println("남는돈 : " + 남는돈 + "원");
		
		//방법 2
		잔수 = money / AMERICANO;
		System.out.println("몇잔? : " + 잔수 + "잔");
		남은돈 = money % AMERICANO;
		System.out.println("남는돈 : " + 남은돈 + "원");
		
		
	}

	
	
}
