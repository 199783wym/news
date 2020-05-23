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
                alert("审核通过");
                window.location.reload();
            } else {
                alert(response.message);
            }
        },
        dataType: "json"
    })
}

function pass2(e) {
    var clueId = e.getAttribute("data-id");
    $.ajax({
        type:"POST",
        url:"/pass2",
        contentType:'application/json',
        data:JSON.stringify({
            "clueId":clueId
        }),
        success:function(response) {
            if (response.code ==200){
                alert("二审通过");
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
function publish(e){
    var clueId = e.getAttribute("data-id");
    $.ajax({
        type:"POST",
        url:"/publishClue",
        contentType:'application/json',
        data:JSON.stringify({
            "clueId":clueId
        }),
        success:function(response) {
            if (response.code ==200){
                alert("发布成功");
                window.location.reload();
            } else {
                alert(response.message);
            }
        },
        dataType: "json"
    })
}

function toSuper(e){
    var clueId = e.getAttribute("data-id");
    var superAdminId=$("#superAdmin").val();
    $.ajax({
        type:"POST",
        url:"/toSuperAdmin",
        contentType:'application/json',
        data:JSON.stringify({
            "clueId":clueId,
            "superAdminId":superAdminId
        }),
    success:function(response) {
        if (response.code ==200){
            alert("指定成功");
            window.location.reload();
        } else {
            alert(response.message);
        }
    },
    dataType: "json"
    })
}

