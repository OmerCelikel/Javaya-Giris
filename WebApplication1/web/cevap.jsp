<%-- 
    Document   : cevap
    Created on : Mar 6, 2019, 7:10:44 PM
    Author     : Ömer Oğuz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP İLE İLK KODLAR</h1>
        <jsp:useBean id="ilkCekirdek" scope="session" class="veri.Kisi" />
        <jsp:setProperty name="ilkCekirdek" property="isim" />
        MERHABA
        <jsp:getProperty name="ilkCekirdek" property="isim" />
        SİTEME HOŞ GELDİN
    </body>
</html>
