package homework1_2;

//import homework1.game;
//import homework1.nexon;

// 넥슨은 게임을 가지고 있다. (포함)

//class ganre{
//	String type;
//}

//class game{
//	ganre g = new ganre();
//	String type2;
//}

public class nexonkorea {
	public static void main(String[] args) {
		game g = new game();
		g.n.name = "스포츠 게임";
		g.type = "피파온라인4";
		
		System.out.println(" 넥슨의 대표 " + g.n.name + "은(는) " + g.type + "입니다.");
	}
}

//class game{
//	String ganre;
//	public game() {};
//	public game(String ganre) {
//		this.ganre = ganre;
//	}
//	public String toString() {
//		return ganre;
//	}
//}
//
//public class nexon {
//	String type;
//	game game = new game();
//	public nexon () {};
//	public nexon (String type, game game) {
//		this.game = game;
//		this.type = type;
//	}
//	
//	public String output() {
//		return type + "은(는) " + game.ganre + "를 가지고 있다."; 
//	}
//	public static void main(String[] args) {
//		nexon nexon = new nexon();
//		nexon.game.ganre = "피파온라인4";
//		nexon.type = "넥슨";
//		System.out.println(nexon.output());
//	}
//}