// array.js

// window.onload : html문서의 모든내용이 브라우저에 표시된 이후에 동작
// window객체: 브라우저 실행 시키기위한 프로그램 틀
// window에만 onload 있는거 아님, 모든 객체(html태그포함)에 존재
// load -> 불러오기 즉 onload는 불러오는 작업이 끝났을때 동작

var item_list = [
  "핸드폰거치대",
  "급속충전기",
  "C타입 케이블",
  "강화유리",
  "스마트폰 링",
  "스마트폰 커버"
];

window.onload = function () { // 시작
  var li = document.getElementsByClassName("item"); // getElements로 가져오면 배열로 가져옴.
  // var li = document.querySelectorAll(".item"); . 포함, 배열로 가여온다 ( 클래스이기 때문에 .을 붙여줘야함)

  //for( var i = 0; i < li.length; i++ )
  for (var i in li) {   //for (in ) : 배열구조에서 사용
    // for ( in) : 배열구조에서 사용
    li[i].innerHTML = item_list[i];
  }
}; // 종료

var item = new Array();
function enroll() { // 시작
  var name = document.getElementById("item_name");
  // var name = document.querySelector("#item_name");

  var prop = name.value;
  item.push(prop);

  var price = document.getElementById("item_price");

  var ul = document.querySelector('#item_list');

  var li = document.createElement("li"); // li 태그 생성

  li.innerHTML = item[item.length - 1]; // li 태그안에 제품명 삽입
  //li.innerHTML = item[item.length - 1] + " " + price.value+" 원" ;
  
  var b = document.createElement("b");
  b.innerHTML = price.value + " 원";
  li.appendChild(b);
  var bt = document.createElement('button');
  bt.setAttribute("class", "del_bt");
  bt.setAttribute("onclick", "del(this)");

  bt.innerHTML = '삭제';
  li.appendChild(bt);

  ul.appendChild(li); // ul 태그 자식으로 li 추가

  // 새 태그(엘리먼트, 요소, 객체)를 생성 하는 방법 : create

  // 태그(엘리먼트) 내부에 새로운 내용으로 삽입하는 방법: innerHTML <- 속성
  // 태그(엘리먼트) 내부에 새로운 내용을 추가 하는 방법 : appendChild <- 함수, 사용하려면 node 필요!
  // 태그(엘리먼트) 내부에 텍스트 형식으로 삽입하는 방법 : appendChild(textnode)
  // #a div
} // 종료

//parent : 부모
function del(obj) { // 시작
  var parent_li = obj.parentNode;
  var parent_ui = parent_li.parentNode;
  parent_ui.removeChild(parent_li);
};//종료

/*
    
    ☆★☆-- 오늘 새롭게 한 내용 (태그) --☆★☆

    document.createElement : 새 태그 생성
    예시) document.createElement("div"); <- div 생성

    appendChild : 자식 태그로 추가
    예시) p = document.createElement("p");
    body.appendChild(p);  : body에 p태그 추가

    setAttribute : 태그에 새속성 추가
    예시) p.setAtteribute("id","ppp");  해당 태그에 id = ppp 삽입

    removeChild : 자식 태그 삭제
    예시) body.removeChild(p); : body 태그에서 해당 태그 삭제

*/

/*
  실습.
  제품 등록하면서 제품 가격과 함께 등록할 수 있게 만들기
  제품 가격 입력하는 input 만들어서 등록

  예시) 거치대 3000원 삭제
*/