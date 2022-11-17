package 자바1116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 맵공부하기 {
	
	public static void main(String[] args) {
		
		//Map : key의 value의 쌍으로 값ㅇ르 저장하는 컬렉션즈 중에 하나
		
		Map<String, Integer> x = new HashMap<String, Integer>();
		
		//Map 데이터 추가
		x.put("one", 1);
		x.put("two", 2);
		x.put("three", 3);
		
		//데이터 가져오기 key를 이용해서 가져옴
		System.out.println(x.get("one"));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empno", 7844);
		map.put("ename", "TURNER");
		map.put("job", "SALESMAN");
		map.put("sal", 1500);
		
		//문제1. empno하고 sal을 출력해보기
		System.out.println("사원번호 : "+ map.get("empno") + " 번");
		System.out.println("급여 : "+ map.get("sal"));
		
		//List안에 Map을 담을 수 있다.
		//Why? Map도 클래스니까
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(map);
		
	}
}











