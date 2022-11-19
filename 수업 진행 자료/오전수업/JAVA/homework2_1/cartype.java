package homework2_1;

public class cartype {
	public static void main(String[] args) {
		policecar p = new policecar();
		p.type = "경찰차";
		p.count = 5;
		p.sound = "삐용삐용";
		
		System.out.println( p.type +"은(는) 차이며, " + p.count + "인승이고, 소리는 " + p.sound +" 울린다.");
		
		
	}
}
