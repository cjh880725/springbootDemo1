<html>
    <head>
        <title>新的世界新的你</title>
    </head>
    <body>
        <table border="1px">
            <thead>
                <tr>
                    <th>id</th>
                    <th>用户名</th>
                    <th>密码</th>
                    <th>姓名</th>
                </tr>
            </thead>
            <tbody>
            <#list userList as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.name}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </body>
</html>