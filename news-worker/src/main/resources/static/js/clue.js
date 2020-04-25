function pass1() {
    var clueId = e.getAttribute("data-id");
    $.ajax({
        type:"POST",
        url:"/pass",
        contentType:'application/json',
        data:JSON.stringify({
            "clueId":clueId
        }),
        success:function(data) {
            if (response.code ==200){
                window.location.reload();
            } else {
                alert(response.message);
            }
        },
        dataType: "json"
    })
}
