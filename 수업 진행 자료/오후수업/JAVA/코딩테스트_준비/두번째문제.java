package 코딩테스트_준비;

public class 두번째문제 {
	public static int 음료수 (int x, int y) {
		return x * y;
	}
	public static int 양꼬치 (int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
//		윤도네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.  
//		양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
//		총얼마를 지불해야 하는지 출력되는 로직을 구현하시오.
		
		int n = 64; //양꼬치
	    int k = 6; //음료수
	    int result = 0; //지불 금액
	    
	    final int 양꼬치 = 12000;
	    final int 음료수 = 2000;
	    final int 서비스음료 = 10;
	    
	    //방법1..
	    int 음료 = 음료수(6, 2000);
	    System.out.println("음료수 : " + 음료);
	    int 꼬치 = 양꼬치(64, 12000);
	    System.out.println("양꼬치 : " + 꼬치);
	    int 합산 = (꼬치 + 음료);
	    System.out.println("합산 : " + 합산);
	    int 나머지 = (합산 - 음료);
	    System.out.println("총 지불 금액 : " + 나머지);
	    
	    //방법2
	    //result = (n*12000) + ((k-n/10)*2000);
	    	//	System.out.println("총 지불할 금액 : " + result);
		
	    //방법 3
	    result = (양꼬치*n) + (음료수*k);
	    int 서비스음료수 = n / 서비스음료;
	    int 제외 = 서비스음료수 * 음료수;
	    
	    result = result - 제외;
	    
	    System.out.println("지불 금액 : " + result);
	    		
	}
}
