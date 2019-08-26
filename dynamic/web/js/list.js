$(function() {
    var parm = {"action":"allUser"};
    var str="";
    $.post(
        "user",
        parm,
        function(data) {
            console.log(data)
            var str = "";
            $.each(data,function(index,item){
                str = str+"<tr>\n" +
                    "                <td><input type=\"checkbox\"/></td>\n" +
                    "                <td>"+item.uid+"</td>\n" +
                    "                <td>"+item.uname+"</td>\n" +
                    "                <td>"+item.password+"</td>\n" +
                    "                <td><a class=\"btn btn-default\" href=\"#\" role=\"button\">修改</a>\n" +
                    "                    <a class=\"btn btn-default\" href=\"#\" role=\"button\">删除</a>\n" +
                    "                </td>\n" +
                    "            </tr>";

            });
            $("#tbody").html(str);
        },
        "json"

    );
});