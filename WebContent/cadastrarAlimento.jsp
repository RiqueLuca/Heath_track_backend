<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="header.jsp" />

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="dynamic-content">
		<form>
			<div class="form-group">
				<label for="weight">Alimento</label> <input type="text"
					class="form-control" id="weight">
			</div>
			<div class="form-group">
				<label for="weight">Quantidade</label> <input type="number"
					class="form-control" id="weight">
			</div>
			<div class="form-group">
				<label for="weight">Data</label> <input type="text"
					class="form-control" id="weight">
			</div>
			<button type="submit" class="btn">Cadastrar</button>
		</form>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>