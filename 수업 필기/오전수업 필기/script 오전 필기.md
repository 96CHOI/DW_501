window 객체 - 최상위 객체

window 객체 : 브라우저를 열었을 때 생성 되는 항상 존재하는 객체

    속성 : classes, defaultStatus, document, frame, history,	length, location, navigator 등

    classes : HTML 문서에서 정의된 모든 스타일 시트
    defaultStatus : 상태바에서 표시될 문자열 지정
    frame : window에 포함된 프레임 수 반환
    -> 여러 프레임이 존재할 경우 (window.frames[0])

    history : window가 방문한 URL 정보

    innerHeight : 현재 브라우저의 document 영역의 높이

    innerWidth : 현재 브라우저의 document 영역의 너비

    location : 현재 문서의 URL 정보

    menubar : 베뉴바 표시 여부 지정

    opener : open() 함수로 생성한 윈도우 이름

    name : window 이름

    outerHeigh : 윈도우 밖 테두리 높이

    outerWidth : 윈도우 밖 테두리 너비
        
    pageXOffset : window에 표시되는 X 위치

    pageYOffset : window에 표시되는 Y 위치

    scrollbars : 스크롤바 표시여부

--------------------------------------------------------------------------------------------------

window 객체 메서드

    alert() : 메시지와 ok버튼을 가진 메시지 박스

    setInerval : 지정된 시간만큼 반복

    setTimeout : 지정된 시간이후에 실행

    clearInerval  : setInerval 해제

    clearTimeout : setTimeout 해제
        
    close() : window 닫기	

    confirm : 질문 다이얼로그  확인과 취소 버튼을 가진 박스

    back, forward : 뒤, 앞으로 이동

    moveBy( x, y ) : 위도우 이동 (상대적)

    moveTo( x, y ) : 위도우 이동 (절대적)

    resizeBy( x, y ) : 윈도우 크기 변경 (상대적)

    resizeTo( x, y ) : 윈도우 크기 변경 (절대적)	
--------------------------------------------------------------------------------------------------

open : 새 윈도우 생성

    -> open ( url , window_name property);
    -> url : 페이지 주소
    -> window_name : _blank(새창에 열린다.)
    ->	_parent ( 부모 프레임에 열린다. );
    ->	_self ( 현재 페이지를 대체한다. )
        _top ( 로드된 프레임셋 대체 )	

-> property  : 새 window의 옵션 부여

     height : 새 창의 높이 지정

     width : 새 창의 너비 지정
	 
     left : 모니터 화면 왼쪽에서 부터 위치

     top : 모니터 화면 위쪽에서 부터 위치
--------------------------------------------------------------------------------------------------
    channelmode : 전체화면 (yes,NO)
        
    fullscreen : 전체화면 (yes, no)

    location : 주소표시줄 표시 여부 (yes, no)

    menubar : 메뉴바 표시 여부 (yes, no)

    scrollbars : 스크롤바 표시여부 (yes, no)

    status : 상태바 표시여부 (yes, no)

    resizable : window 크기 변경 가능 여부 (yes, no)

    toobat : 툴바 표시여부 (yes, no)

--------------------------------------------------------------------------------------------------


    실습위주 페이지 (기본 (유튜브보다 나음))
    https://www.w3schools.com/
        
    기본은 된다 싶을때 (기초가 안되면 보기 힘들다)
    https://developer.mozilla.org/en-US/

--------------------------------------------------------------------------------------------------

10 / 20

    // screen - 화면 정보 제공
    screen.width : 화면의 전체 너비 (해상도 너비)
    screen.height : 화면의 전체 높이 (해상도 높이)
    screen.availWidth : 실제 사용 가능한 화면 너비
    screen.availHeight : 실제 사용 가능한 화면 높이
    screen.colorDepth : 사용가능한 색상 수
    screen.pixelDepth : 한 픽셀당 비트 수

    //form 객체
    document.write("길이 : " + document.forms.length + "<br>");
    // 폼 양식이 현재 몇개가 있는지 찾기

    // document 객체
    document.write("title : " + document.title + "<br>"); // 타이틀 명 찾기
    document.write("마지막 수정 : " + document.lastModified + "<br>");
    // 마지막 수정 일자 찾기
    document.bgColor = "pink"; // 배경색 출력
    document.write("배경색 : " + document.bgColor + "<br>"); // 현재 배경 색 찾기
                document.write("링크색 : " + document.linkColor + "<br>");
    document.write("링크색 : " + document.alinkColor + "<br>");
    document.write("링크색 : " + document.vlinkColor + "<br>");	

--------------------------------------------------------------------------------------------------

10/21

    history 객체
    사용자의 웹사이트 사용 내역

    history.length : 히스토리 목록에 포함된 url의 수

    history.back() : 뒤로 이동

    history.forward() : 앞으로 이동

    history.go( 2 ) : 현제 url 위치에서 2만큼 앞으로 이동, 음수라면 뒤로, 양수라면 앞으로

--------------------------------------------------------------------------------------------------

Location 객체

현재 윈도우의 url 주소에 대한 정보 제공 객체

    location.host : 호스트 이름과 포트번호(url로 부터 분리하여 제공) www.naver.com:80

    location.hostname : url주소에 대한 호스트 이름

    location.href : 하이퍼링크로 주소지정

    location.pathname : 디렉토리 위치 (호스트)

    location.port : 호스트 포트번호

    location.protocol : 포로토콜 종류

    location.reload() : 문서다시 읽기 (새로고침)

    window.location.assign (url 주소) : url로 이동 (방문기록 저장)

    window.location.replace (url) : url로 이동 (방문기록 덮어씀)

--------------------------------------------------------------------------------------------------

navigator 객체

웹 브라우저의 특성 정보를 가지는 객체

    navigator.appName : 사용중인 브라우저 종류

    navigator.appCodeName : 사용중인 웹브라우저 이름

    navigator.appVersion : 브라우저 버전 및 os이름

    navigator.plaform : 운영체제 환경

    navigator.userAgent : 웹브라우저 종류와 버전

    navigator.pugins : 설치된 플러그인 정보

    navigator.mimeTypes : 브라우저에서 지원 되는 MIME 타입

    - MIME 타입 종류 : text, image, audio, video, application, message, multiport

    image – gif, jpeg

    video – mpeg

    application – stream, script