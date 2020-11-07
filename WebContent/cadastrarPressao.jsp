<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<div class="dynamic-content">
    <form>
        <div class="form-group">
            <label for="weight">Pressão Sistólica</label>
            <input type="number" class="form-control" id="weight">
        </div>
        <div class="form-group">
            <label for="weight">Pressão Diastólica</label>
            <input type="number" class="form-control" id="weight">
        </div>
        <div class="form-group">
            <label for="weight">Idade</label>
            <input type="number" class="form-control" id="weight">
        </div>
        <div class="form-group">
            <label for="weight">Data</label>
            <input type="date" class="form-control" id="weight">
        </div>
        
        <button type="submit" class="btn">Cadastrar</button>
    </form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>