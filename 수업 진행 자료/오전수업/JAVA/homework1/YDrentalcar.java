package homework1;

import java.text.DecimalFormat;

//import homework1.car;
//import homework1.rentalcar;

//렌터카 회사는 차를 가지고 있다. (포함)

//class model{
//	String model;
//	String date;
//}

//class car{
//	model m = new model();
//	int price;
//}

public class YDrentalcar {
	public static void main(String[] args) {
		car c = new car();
		c.r.model = "KIA K3";
		c.r.date = "3일";
		c.price = 130000;
		
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		String ch = dc.format(c.price);
		
		System.out.println("렌트 차량 : " + c.r.model + "\n렌트 기간 : " +c.r.date + "\n렌트 가격 : " + ch + "원");
	}
}

//class car{
//	String model;
//	public car() {};
//	public car(String model) {
//		this.model = model;
//	}
//	public String toString() {
//		return model;
//	}
//}
//
//public class rentalcar {
//	String type;
//	car car = new car();
//	public rentalcar () {};
//	public rentalcar (String type, car car) {
//		this.car = car;
//		this.type = type;
//	}
//	
//	public String output() {
//		return type + "은(는) " + car.model + "를 가지고 있다."; 
//	}
//	public static void main(String[] args) {
//		rentalcar rental = new rentalcar();
//		rental.car.model = "벤츠";
//		rental.type = "YD 렌터카";
//		System.out.println(rental.output());
//	}
//	
//}
