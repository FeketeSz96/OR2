<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Időjárás app</title>
</head>
<body>
<center>
    <h1>Időjárás hírlevél felíratkozás</h1>
    <form method="post" action="subscribe">
        <table border="3px" width="40">
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" size="65" /></td>
            </tr>
            <tr>
                <td>Település:</td>
                <td><input type="text" name="city" size="65" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Felíratkozás" />
                </td>
            </tr>
        </table>
    </form>

    <h1>Leíratkozás a hírlevélről</h1>
    <form method="post" action="unsubscribe">
        <table border="3px" width="40%">
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" size="65" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Leíratkozás" />
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>