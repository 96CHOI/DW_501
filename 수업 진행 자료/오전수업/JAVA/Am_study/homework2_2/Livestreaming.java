package homework2_2;

import java.text.DecimalFormat;

public class Livestreaming {
	public static void main(String[] args) {
		afreecatv a = new afreecatv();
		a.type = "아프리카TV";
		a.types = "인터넷 방송 플랫폼";
		a.price = 1100;
		
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		String ch = dc.format(a.price);
		
		System.out.println(a.type + "은(는)" + a.types + "이며 별풍선은 10개에 " + ch + "원이다.");
		
	}
}
