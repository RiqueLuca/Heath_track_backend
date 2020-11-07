<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<jsp:include page="header.jsp" />
    <title>Health Track</title>
</head>

<body>
    <div class="flex-dashboard">
        <sidebar id="sidebar">
            <div class="sidebar-title">
                <img src="resources/images/logo_health_track_espandido_cinza.png" alt="Logo Health Track">
            </div>
            <div class="menu">
                <ul>
                    <li>
                        <i class="fas fa-chart-line"></i>
                        <a href="dashboard.jsp">DASHBOARD</a>
                    </li>
                    <li>
                        <i class="fas fa-user-circle"></i>
                        <a href="perfil.jsp">PERFIL</a>
                    </li>
                    <li>
                        <i class="fas fa-weight "></i>
                        <a href="gerenciarPeso.jsp">PESO E ALTURA</a>
                    </li>
                    <li class="selected">
                        <i class="fas fa-heartbeat"></i>
                        <a href="gerenciarPressao.jsp">PRESSÃO ARTERIAL</a>
                    </li>
                    <li>
                        <i class="fas fa-running"></i>
                        <a href="gerenciarAtividades.jsp">ATIVIDADES FÍSICAS</a>
                    </li>
                    <li>
                        <i class="fas fa-calculator"></i>
                        <a href="imc.jsp">IMC</a>
                    </li>
                    <li>
                        <i class="fas fa-utensils"></i>
                        <a href="gerenciarAlimentos.jsp">ALIMENTOS</a>
                    </li>
                    <li class="sidebar_logout">
                        <i class="fas fa-sign-out-alt"></i>
                        <a href=login.jsp>LOGOUT</a>
                    </li>

                </ul>
            </div>

        </sidebar>
        <main id="mainContent">
            <header>
                <i id="iconMenu " onclick="responsiveSidebar() " class="fas fa-bars "> </i>
                <a href="login.jsp"><i class="fas fa-sign-out-alt"></i> LOGOUT</a>
            </header>
            <div class="main-content">
                <div class="panel-row">
                    <button class="panel panel-50" a-view="cadastrarPressao" onclick="fetchContent(this)" a-folder="pressao">
                        <i class="fas fa-plus"></i>
                        Cadastrar pressão arterial
                    </button>
                </div>
                <div class="content" id="ajax-content"></div>
                <div class="dynamic-content">
                    <table class="table table-dark">
                        <thead>
                            <tr>
                                <th scope="col">Data</th>
                                <th scope="col">mmHg</th>
                                <th scope="col">Idade</th>
                                <th scope="col">Editar</th>
                                <th scope="col">Deletar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">20/06/2020</th>
                                <td>120/80</td>
                                <td>24 anos</td>
                                <td><i class="fas fa-edit"></i></td>
                                <td><i class="fas fa-trash-alt"></i></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            
        </main>
    </div>
	<jsp:include page="footer.jsp" />
</body>

</html>