<HTML>
<HEAD>
<TITLE>
WElcome to hello jsp
</TITLE>
</HEAD>
<body>
<%
String name= request.getPaparameter("fname");
String lastname= request.getPaparameter("lname");
for(int i =0;i<5;i++){

 %>
<H1>
<%=i+1%>hello<%=name %></H1>
<%
}
 %>
</body>

