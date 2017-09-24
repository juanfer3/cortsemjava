<%--
    Document   : PDf
    Created on : 23/09/2017, 05:07:22 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="Pdf/jspdf.js"></script>
        <script src="Pdf/FileSaver/FileSaver.min.js"></script>
        <script type="text/javascript">
        function simple(){
          var doc = new jsPDF();
          doc.text(20,20, "hi app! °)");

          doc.addPage();
    
          doc.save('simple.pdf');

        }
        </script>
    </head>
    <body>
      <a href="javascript:simple()"> Salvar</a>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.2/jspdf.min.js"></script>
    </body>
</html>
