<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/24 0024
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>list</title>

    <!-- Bootstrap -->
    <link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery-3.4.1.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="js/list.js"></script>
</head>
<body>
<center>
    <div style="margin-top: 50px">
        <a class="btn btn-default" href="#" role="button" style="margin-bottom: 20px">添加用户</a>
        <table class="table table-bordered" style="width: 60%">
            <tr>
                <th><input type="checkbox"/></th>
                <th>id</th>
                <th>姓名</th>
                <th>密码</th>
                <th>操作</th>
            </tr>
            <tbody id="tbody">
            <tr>
                <td><input type="checkbox"/></td>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td><a class="btn btn-default" href="#" role="button">修改</a>
                    <a class="btn btn-default" href="#" role="button">删除</a>
                </td>
            </tr>

            </tbody>

        </table>
    </div>

    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li>
                <a href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li>
                <a href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>
</center>

</body>
</html>
