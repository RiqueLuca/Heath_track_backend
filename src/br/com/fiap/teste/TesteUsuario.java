package br.com.fiap.teste;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.dao.impl.UsuarioDAOImpl;
import br.com.fiap.model.Usuario;

public class TesteUsuario {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy");
		UsuarioDAOImpl dao = new UsuarioDAOImpl();

//		Usuario usuarioA = new Usuario();
//		usuarioA.setNome("Paola");
//		usuarioA.setSobrenome("Assis");
//		usuarioA.setEmail("assispaola.dev@gmail.com");
//		usuarioA.setSenha("Lola@2020");
//		String data = "11/11/1993";
//		Date dataf = formatacaoData.parse(data);
//		java.sql.Date dataSql = new java.sql.Date(dataf.getTime());
//		usuarioA.setDtNasc(dataSql);
//		usuarioA.setDtCadastro(Calendar.getInstance());
//		dao.cadastrar(usuarioA);
//
//		Usuario usuarioB = new Usuario();
//		usuarioB.setNome("Guilherme");
//		usuarioB.setSobrenome("Vilhena");
//		usuarioB.setEmail("guilherme.vilhena02@gmail.comm");
//		usuarioB.setSenha("Gui@21234");
//		String dataB = "22/04/2002";
//		Date datafB = formatacaoData.parse(dataB);
//		java.sql.Date dataSqlB = new java.sql.Date(datafB.getTime());
//		usuarioB.setDtNasc(dataSqlB);
//		usuarioB.setDtCadastro(Calendar.getInstance());
//		dao.cadastrar(usuarioB);
//
//		Usuario usuarioC = new Usuario();
//		usuarioC.setNome("Henrique");
//		usuarioC.setSobrenome("De Luca");
//		usuarioC.setEmail("riqueluca@live.com");
//		usuarioC.setSenha("DeLuca@1122");
//		String dataC = "08/04/1994";
//		Date datafC = formatacaoData.parse(dataC);
//		java.sql.Date dataSqlC = new java.sql.Date(datafC.getTime());
//		usuarioC.setDtNasc(dataSqlC);
//		usuarioC.setDtCadastro(Calendar.getInstance());
//		dao.cadastrar(usuarioC);
//
//		Usuario usuarioD = new Usuario();
//		usuarioD.setNome("Gustavo");
//		usuarioD.setSobrenome("Petry");
//		usuarioD.setEmail("gustavopetry@outlook.com");
//		usuarioD.setSenha("Petry@1010");
//		String dataD = "03/08/1995";
//		Date datafD = formatacaoData.parse(dataD);
//		java.sql.Date dataSqlD = new java.sql.Date(datafD.getTime());
//		usuarioD.setDtNasc(dataSqlD);
//		usuarioD.setDtCadastro(Calendar.getInstance());
//		dao.cadastrar(usuarioD);
//		
//		Usuario usuarioE = new Usuario();
//		usuarioE.setNome("Henrique");
//		usuarioE.setSobrenome("Ferreira");
//		usuarioE.setEmail("ihenriqueferr@gmail.com");
//		usuarioE.setSenha("Rique@1407");
//		String dataE = "14/07/1995";
//		Date datafE = formatacaoData.parse(dataE);
//		java.sql.Date dataSqlE = new java.sql.Date(datafE.getTime());
//		usuarioE.setDtNasc(dataSqlE);
//		usuarioE.setDtCadastro(Calendar.getInstance());
//		dao.cadastrar(usuarioE);

		List<Usuario> lista = dao.listarTodos();
		for (Usuario usuario : lista) {
			System.out.println("ID: " + usuario.getIdUsuario() + " - Nome: " + usuario.getNome() + " - Sobrenome: " + usuario.getSobrenome() + " - E-mail: "
					+ usuario.getEmail() + " - Senha: " + usuario.getSenha() + " - Data de Nascimento: " + formatacaoData.format(usuario.getDtNasc()) + " - Data de Cadastro: "
					+ formatacaoData.format(usuario.getDtCadastro().getTime()));
		}

	}

}
