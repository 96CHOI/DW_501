package movie;

public class movieVo {
	
	
	private String title;
	private int year;
	private String age;
	
//	public movieVo() {}
	
	public movieVo(String title, int year, String age) {
		this.title = title;
		this.year = year;
		this.age = age;
	}
	
	@Override
	public String toString() { // toString 메서드는 자바에서 일반적인 출력 용 메서드이다.
		return "제목 : " + title + ", 개봉년도 : " + year + ", 관람등급 : " + age+ "세 이상"; 
	}
	
	//Private 된 변수를 확인 할 때, 이걸 사용하지 않으면 db에 자동 저장 못함
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}


	public void output() {
		System.out.println("제목 : " + title + ", 개봉년도 : " + year + ", 관람등급 : " + age);
	}
}

/*
영화제목, 개봉년도, 관람등급


생성자 메서드를 통해 데이터 저장가능하게 만들기
출력 메서드 (제목, 년도, 등급 출력되어야함)


*/