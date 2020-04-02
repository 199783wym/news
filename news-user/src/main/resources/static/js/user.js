function post(){
    var username=$("#username_ri").val();
    var password=$("#password_ri").val();
    var password2=$("#password2_ri").val();
    if (password!=password2){
        alert("两次输入的密码不同")
    }
    $.ajax({
        type:"POST",
        url:"/register",
        contentType :'application/json',
        data:JSON.stringify({
            "username":username,
            "password":password
        }),
        success: function(response){
            console.log(response);
            if(response.code==200){
                window.location.reload();
            }else{
                alert("注册失败");
            }
        },
        dataType :"json"
    })
}
