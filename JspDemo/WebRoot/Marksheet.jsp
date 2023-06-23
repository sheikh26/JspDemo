
<%@page import="com.Vo.MarksheetVo"%><html>
	<body>
		<form action="MarksheetCtl" method="get">
			<table border="5" bgcolor="blue">
<% 
MarksheetVo vo = (	MarksheetVo) request.getAttribute("get");
if(vo == null)
{
vo=new MarksheetVo();
}

 %>
				<tr>
					<td>
						Rollno
					</td>
					<td>
						<input type="text" name="rollNo" value="<%=vo.getRollNo() %>">
					</td>

				</tr>
				<tr>
					<td>
						Name
					</td>
					<td>
						<input type="text" name="name"value="<%=vo.getName() %>">
					</td>
				</tr>
				<tr>
					<td>
						Chemistry
					</td>
					<td>
						<input type="text" name="chemistry"value="<%=vo.getChemistry() %>">
					</td>
				</tr>
				<tr>
					<td>
						physics
					</td>
					<td>
						<input type="text" name="physics"value="<%=vo.getPhysics() %>">
					</td>
				</tr>
				<tr>
					<td>
						maths
					</td>
					<td>
						<input type="text" name="Maths"value="<%=vo.getMaths() %>">
					</td>
				</tr>
			<tr>
					<td>
						<input type="submit" name="operation" value="Add">
						<input type="submit" name="operation" value="Delete">
						<input type="submit" name="operation" value="Update">
						<input type="submit" name="operation" value="Get">
					</td>
				</tr>
			</table>
		</form>
		
		</body></html>
		
		
		
		
		
		
		
		
		
		
		