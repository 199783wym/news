// function submitForm(pageIndex, pageSize) {
//     var formData = new FormData(); //将需要提交的参数封装起来
//     formData.append("id", $("#id").val());
//     var zswb = $("#file").val();    //获取file中的内容,看是否有值
//     if (zswb == '' || zswb.length < 1) {    //没有file提交的时候走的接口
//         $.ajax({
//             url : '/editMovieWithoutFile',
//             type : 'post',
//             data : formData,
//             processData : false,
//             contentType : false,
//             success : function(value) {
//                 var result = JSON.parse(value);
//                 if (result == 'true') {
//                     window.location.href = "/index?pageIndex=" + pageIndex+ "&pageSize=" + pageSize;
//                 } else {
//                     Lobibox.alert('error', {msg : "媒资信息更新失败!!!"});
//                 }
//             }
//         });
//     } else {    //有file提交的时候走的接口
//         formData.append("file", $("#file")[0].files[0]);
//         $.ajax({
//             url : '/editMovieInfo',
//             type : 'post',
//             data : formData,
//             processData : false,
//             contentType : false,
//             success : function(value) {
//                 var result = JSON.parse(value);
//                 if (result == 'true') {
//                     window.location.href = "/index?pageIndex=" + pageIndex+ "&pageSize=" + pageSize;
//                 } else {
//                     Lobibox.alert('error', {msg : "媒资信息更新失败!!!"});
//                 }
//             }
//         });
//     }
// }

//图片回显:
function preview(file) {
    $("#imgHidden").css("display", "none");
    var prevDiv = document.getElementById('preview');
    if (file.files && file.files[0]) {
        var reader = new FileReader();
        reader.onload = function(evt) {
            prevDiv.innerHTML = '<img style="width: 100px;height: 100px;" src="' + evt.target.result + '" />';
        }
        reader.readAsDataURL(file.files[0]);
    } else {
        prevDiv.innerHTML = '<div class="img" style="width: 100px;height:100px;filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' +
            file.value + '\'"></div>';
    }
}

function sendRenzheng() {
    // var formData = new FormData(); //将需要提交的参数封装起来
    // formData.append("id", $("#id").val());
    // var zswb = $("#file").val();    //获取file中的内容,看是否有值
    var formData =new FormData();
    formData.append("file",$("#file")[0].files[0]);
    formData.append("title",$("#title").val());
    //没有file提交的时候走的接口
    $.ajax({
        url: '/toRenzheng',
        type: 'post',
        data:formData,
        processData : false,
        contentType : false,
        success: function (response) {
            if (response.code==200) {
                window.alert("提交成功");
                window.location.reload();
            } else {
                alert("提交失败");
            }
        },
        dataType:"json"
    })


}
