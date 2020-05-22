function renzhengPass(e) {
    var renzhengId = e.getAttribute("data-id");
    $.ajax({
        type:"POST",
        url:"/renzhengPass",
        contentType :'application/json',
        data:JSON.stringify({
            "clueId":renzhengId
        }),
        success:function (response) {
            if (response.code ==200){
                alert("审核通过");
                window.location.reload();
            } else {
                alert(response.message);
            }
        },
        dataType :"json"
    })
}
function renzhengNoPass(e) {
    var renzhengId = e.getAttribute("data-id");
    $.ajax({
        type:"POST",
        url:"/renzhengNoPass",
        contentType :'application/json',
        data:JSON.stringify({
            "renzhengId":renzhengId
        }),
        succeess:function (response) {
            if (response.code ==200){
                alert("已审核为不通过");
                window.location.reload();
            } else {
                alert(response.message);
            }
        },
        dataType :"json"
    })
}
