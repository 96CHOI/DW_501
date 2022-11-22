package homework2;

import java.text.DecimalFormat;

public class emart {

	//썬칩은 과자이다.
	
	public static void main(String[] args) {
		snack s = new snack();
		s.type = "썬칩";
		s.ea = "3개";
		s.price = 2000;
		
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		String ch = dc.format(s.price);
		
		System.out.println(s.type + "을(를)" + s.ea + "를 " + ch + "원에 구매하셨습니다." );
	}
	
}