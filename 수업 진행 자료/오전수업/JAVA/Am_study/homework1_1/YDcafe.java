package homework1_1;

import java.text.DecimalFormat;

//import homework1.drink;
//import homework1.cafe;

// 카페는 커피를 가지고 있다. (포함)

//class coffe{
//	String type;
//}

//class drink{
//	coffe c = new coffe();
//	int price;
//}

public class YDcafe {
	public static void main(String[] args) {
		cafe c = new cafe();
		c.f.type = "아이스아메리카노";
		c.price = 4500;
		
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		String ch = dc.format(c.price);
		
		System.out.println(c.f.type + "은(는) " + ch + "원 입니다.");
	}
}


//class coffe {
//	String menu;
//	public coffe() {};
//	public coffe(String menu) {
//		this.menu = menu;
//	}
//	public String toString() {
//		return menu;
//	}
//}
//
//public class cafe{
//	String type;
//	coffe coffe = new coffe();
//	public cafe() {};
//	public cafe(String type, coffe coffe) {
//		this.coffe = coffe;
//		this.type = type;
//	}
//	
//	public String output() {
//		return type + "은(는) " + coffe.menu + "를 가지고 있다."; 
//	}
//	public static void main(String[] args) {
//		cafe cafe = new cafe();
//		cafe.coffe.menu = "아이스아메리카노";
//		cafe.type = "choi 카페";
//		System.out.println(cafe.output());
//	}
//}

