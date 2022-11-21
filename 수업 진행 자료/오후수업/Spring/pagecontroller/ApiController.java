package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * RestControoler 와 Controller 차이점
 * 
 * Controller는 페이지(html) 이동
 * RestControoler는 데이터 (JSON) 전송
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	// Rest : 자원 (== 데이터)

	/*
	 * 클래스 이름 : 앞에 대문자로 시작 ex) Apple (o) apple (x) 변수 명 : 상수를 제외한 변수 이름은 소문자 :
	 * String name (o) String Name (x) 상수 : final double PI = 3.14 (o) fainal double
	 * pi = 3.14 (x) 함수이름 : 명사 (x) 동사 (o) ex) function makeData(o) function data(x)
	 */

	@GetMapping("/api/v1/sample")
	public List<String> callData() {
		List<String> list = new ArrayList<String>();
		list.add("삼겹살");
		list.add("오리고기;");
		list.add("목살");

		return list;
	}

	// Get : 조회
	// Mapping : URL 연결
	// v1 : 버전을 의미함 (version 1)
	@GetMapping("/api/v1/movie")
	public Movie callMovie() {

		Movie movie = new Movie();
		movie.setTitle("Just Freinds");
		movie.setYear("2005");
		movie.setRuntime("96 min");
		movie.setGenre("Comedy, Romance");
		// movie라는 객체를 전달함
		return movie;
	}

	// URL이름은 중복될 수 없다.
	@GetMapping("/api/v1/movies")
	public List<Movie> callMovies() {
		List<Movie> list = new ArrayList<Movie>();
		Movie movie = new Movie();
		movie.setTitle("Just Freinds");
		movie.setYear("2005");
		movie.setRuntime("96 min");
		movie.setGenre("Comedy, Romance");

		Movie movie2 = new Movie();
		movie2.setTitle("Just Freinds");
		movie2.setYear("2005");
		movie2.setRuntime("96 min");
		movie2.setGenre("Comedy, Romance");

		list.add(movie);
		list.add(movie2);

		return list;
	}

	// ? -> 쿼리스트링
	// & -> 엔드연산자
	// URL을 이용해서 데이터를 받는 방법.
	// Path 길(주소 or 경로)로 데이터 받기!
	// Path(경로) + Variable (값)
	// 데이터가 1개 혹은 2개이면 Path로 함.
	@GetMapping("/api/v1/sports/qatar2022/article/{articleNumber}")
	public int callArticle(@PathVariable int articleNumber) {
		return articleNumber;
	}
	// /webtoon/list?titleId=758037&weekday=mon

	// ? 쿼리스트링으로 데이터 받기
	// /api/v1/webtoon/list?titleId=758037&weekday=mon
	// Request(요청) + Param (파라미터)
	// 데이터 보낼게 많으면 쿼리스트링
	@GetMapping("/api/v1/webtoon/list")
	public Map<String, Object> callwebtoon(@RequestParam int titleId, @RequestParam String weekday) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);

		return map;
	}

	@GetMapping("/api/v1/webtoon/list/titleId/{titleId}/weekday/{weekday}")
	public Map<String, Object> callwebtoon2(@PathVariable int titleId, @PathVariable String weekday) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);

		return map;
	}
}
	
