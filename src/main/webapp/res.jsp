<%@ page isELIgnored="false" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <script type="application/javascript">
        function checkusername() {
            //获取用户名
            var input = document.getElementById("input");
            var username = input.value;
            //发送请求到后台进行对应的校验

            //创建异步请求对象
            var xhr;
            if (window.ActiveXObject) {
                //IE
                xhr = new ActiveXObject("Microsoft.XMLHTTP");
            } else {
                xhr = new XMLHttpRequest();
            }
            //打开异步请求
            xhr.open("GET", "${pageContext.request.contextPath}/aaa/queryAdmin?username=" + username);
            //发送一部请求

            //POST
            //xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
            //xhr.send("username="+username);

            xhr.send(null);
            //监听响应
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    //获取后台传入信息
                    var message = xhr.responseText;
                    var span = document.getElementById("span");
                    span.innerHTML = message;
                }
            }
        }
    </script>
</head>

<body>
<form method="get" action="${pageContext.request.contextPath}/aaa/insert">
    用户名：<input id="input" type="text" name="admin.username" onblur="checkusername()"/><span id="span"></span></span>
    <br/>
    密 码：<input type="password" name="admin.password"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
