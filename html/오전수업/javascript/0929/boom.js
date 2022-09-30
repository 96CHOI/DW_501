// boom.js

var board = new Array(400);
board.fill(0); // 배열에 채우기

for(var i = 0; i < 200;){
    let pos = Math.floor(Math.random() * 400);
    if( board[pos] != 1 ) { // 있는지 없는지 판단..(중복 제거를 위한 작업)
        board[pos] = 1;
        i++;
    }
}

window.onload = function(){ // 테이블 태그 제작
  var table = "<table>";
  for(var  i = 0; i < 20; i++){
    table += "<tr>";
    for(var k = 0; k < 20; k ++){
      table += "<td class='bm' data-idx="+ (i * 20 + k) +"></td>";
      // 밖에 사용한 따옴표와 같은 따옴표를 써야 조건식 적용 가능.
      }
      table += "</tr> ";
  }
  document.getElementById("wrap").innerHTML = table;

  var bm = document.getElementsByClassName("bm");

  //alert(bm.length);
  //bm[0].style.background = 'red'
  for (var i in bm){
    bm[i].addEventListener('click',function(){
      //이벤트에 사용하는 i와 폭탄 구하는 i와 같이 사용 못함.
      //이벤트가 실행했을때는 이미 for문이 끝났다.
      let n = this.dataset.idx;
      if (board[n] == 1) {
        this.style.background =
          'url(../../image/Bomb.png) no-repeat center center';
        this.style.backgroundSize = 'cover';
        // this.innerHTML="<img src='../../image/Bomb.png'>";
      } else this.style.background = "rgb(230,230,230)";
    });
  }
};
