function dataSend() {
// 1. 보낼 데이터 만들기
    var data = {
        content : $('#input-data').val(),
        complete : false
    }

// 2. url 주소 사용하기

    $.Ajax({
        type: 'POST',
        url: '/todo/api',
        dataType: 'json',
        contentType: 'applocation/json; charset=utf-8',
        data: JSON.stringify(data)
    }).done(function() {
        window.location.href="/";
    }).fail(function(error) {
        alert(JSON.stringify(error));
    });
// 3-1. 성공했을 때

// 3-2. 실패했을 때
}