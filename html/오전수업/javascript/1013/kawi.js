
function start(){
        var com = parseInt(Math.random()*100)+1;
        var start = document.getElementById("start_box")

        start.innerHTML = com;

        var user = parseInt(Math.random()*100)+1;
        var user1 = document.getElementById("start_user")

        user1.innerHTML = user;

}