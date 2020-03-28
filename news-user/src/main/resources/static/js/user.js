function post(){
    var username=$("#username_ri").val();
    var password=$("#password_ri").val();
    var password2=$("#password2_ri").val();
    if (password!=password2){
        alert("两次输入的密码不同")
    }
    console.log(username + password + password2);
}
