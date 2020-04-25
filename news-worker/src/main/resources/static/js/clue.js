function pass1(e) {
    var clueId = e.getAttribute("data-id");
    $.ajax({
        type:"POST",
        url:"/pass",
        contentType:'application/json',
        data:JSON.stringify({
            "clueId":clueId
        }),
        success:function(response) {
            if (response.code ==200){
                window.location.reload();
            } else {
                alert(response.message);
            }
        },
        dataType: "json"
    })
}

function  nopass(e) {
    var clueId = e.getAttribute("data-id" );
    $.ajax({
        type:"POST",
        url:"/nopass",
        contentType :'application/json',
        data:JSON.stringify({
            "clueId":clueId
        }),
        success:function(response
        ) {
            if (response.code ==200){
                window.location.reload();
            } else {
                alert(response.message);
            }
        },
        dataType :"json"
    })

}
