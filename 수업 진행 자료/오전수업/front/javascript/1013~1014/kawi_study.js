
user(); 

function user() { //유저
    var u = parseInt(prompt("1. 가위 2. 바위 3. 보"));
    var c = com();
    result(u, c);
}

function com() { //컴퓨터
    var c = Math.floor(Math.random()*3)+1;
    return c;
}

function result(u, c) { //결과
    if (u == c) {
        alert("비김");
    } else if ((u == 1 && u == 3) || (u == 2 && u == 1) || (u == 3 && u == 2)) {
        alert("승리");
    } else {
        alert("패배");
    }

}