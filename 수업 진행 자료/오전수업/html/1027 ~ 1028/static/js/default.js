$(document).ready(function(){
    $(".menu-toggle").on("click",function(){
        $(".gnb").stop().slideToggle('fast');
    });
});

// 시간설정 가능, fast, slow
// Show(); //나타나게
// hide(); //사라지게
// toggle(); //나타갔다가, 사라졌다가 두개 다 됨.
// fadein(); //투명도
// fadeout();
// slideup();
// slidedown();
// slideToggle();