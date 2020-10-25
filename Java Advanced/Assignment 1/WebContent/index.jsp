<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
		form {
			position: relative;
			left: 50%;
			width: 250px;
			height: 300px;
			border-style: groove;
			}
		input {
			margin:  10px;
			display: block;
			margin: 0 auto;
		}
		
		label {
		display: block;
		text-align: center;
		margin-bottom: 10px;
		margin-top: 10px;
		}
		
		table {
		margin-bottom: 30px;
		}
		
		#btn1  {
		position: absolute;
		margin-top: 20px;
		left: 35%;	
		}
		
		#btn2  {
		position: absolute;
		margin-top: 20px;
		left: 60%;	
		}
		
</style>
</head>
<body>
		<table  border="1" bordercolor="gray" align="center" cellpadding="10" cellspacing="0">
			<tr>
					<td width="30">STT</td>
					<td width="100">Ten VXL</td>
					<td width="100">Hang sx</td>
					<td width="100">Ngay ra mat</td>
					<td width="100">Gia(vnd)
			</tr>
		</table>
		<form action="result.jsp" >
			<label><b>Ten VXL</b></label>
			<input type="text" name="tenVXL">
			<label><b>Hang</b></label>
			<input type="text" name ="hang">
			<label><b>Ngay ra mat</b></label>
			<input type="text" name ="ngayRaMat">
			<label><b>Gia</b></label>
			<input type="text" name ="gia">
			<button id="btn1" onclick="them">Them</button>
			<button id="btn2" onclick="huy">Huy</button>
		</form>
		<script type="text/javascript">
				function them(){
					
				}
				
				function huy(){
					
				}
		</script>
</body>
</html>