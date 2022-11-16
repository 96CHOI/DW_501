package 코딩테스트_준비;

public class 네번째문제 {
	public static void main(String[] args) {
	
		int[] array = {149, 180, 192, 170};
		int height = 167;
		int answer = 0;
		
		for(int i : array) {
			if (i > height) {
				answer++;
			}
		}
		
		System.out.println("머쓱이보다 키큰 인원 : " + answer + "명");
	}	
}
