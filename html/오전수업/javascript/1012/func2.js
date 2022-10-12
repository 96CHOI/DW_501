/*
html 작업
1. input 1개 (생년월일입력 : 1999.01.02)
   너비 200, 높이35, 폰트17
2. 버튼 1개 생성
   입력, 너비 100 높이 37 폰트 15
3. div #birthday 생성
4. div #birthday 하위 태그로 ul태그 생성
5. ul태그 하위로 li태그 3개
   (각각 li에 태어난년도, 태어난월, 나이)

자바스크립트 작업
1. 버튼 이벤트 생성, 함수 input
2. input함수에서 value 값 가져오고 출력
3. getYear함수 (태어난 년도 구하기)
4. getMonth함수 (태어난 월 구하기)
5. getAge함수 (나이 구하기)
*/

window.onload = function () { //시작
    var add = document.getElementById("bt").addEventListener("click", input);
}
function input() {
    var birth = document.getElementById("birth").value;

    var year = document.getElementById("year");
    var month = document.getElementById("month");
    var age = document.getElementById("age");

    year.innerHTML = getYear(birth);

    month.innerHTML = getMonth(birth);

    age.innerHTML = getAge(birth)
}

function getYear(birth) {
    var year = birth.split(".")[0];
    return "년도 : " + year + " 년";
}

function getMonth(birth) {
    var month = birth.split(".")[1];
    return "월 : " + month + " 월";
}

function getAge(birth) {
    var age = birth.split(".")[0];
    return "나이 : " + (2022 - age + 1) + " 세";
}