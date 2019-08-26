<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>login</title>

    <!-- Bootstrap -->
    <link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery-3.4.1.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>

    <div style=" width: 1600px; height:700px; background-color: dodgerblue">
        <div style=" width: 300px; height:200px;background-color: white;position:absolute;left:1150px;top:80px;"></div>
    <div style=" width: 300px; height:200px; position:absolute;left:1200px;top:100px; " >
        <form class="form-inline" method="post" action="user">
            <input type="hidden" value="login" name="action" />
            <div class="form-group">
                <label class="sr-only" for="exampleInputEmail3">name</label>
                <input type="text" class="form-control" id="exampleInputEmail3" placeholder="name" name="uname">
            </div>
            </br></br></br>
            <div class="form-group">
                <label class="sr-only" for="exampleInputPassword3">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword3" placeholder="Password" name="password">
            </div>
            </br></br>
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
            <button type="submit" class="btn btn-default">Sign in</button>
        </form>
    </div>
    </div>

</body>
</html>