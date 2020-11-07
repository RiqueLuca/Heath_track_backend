package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Alimento;

public interface AlimentoDAO {
	
	public List<Alimento> listarTodos();
	
	public void cadastrar(Alimento alimento);
  	    
    public void atualizar(Alimento alimento);
  
    public void remover(int idAlimento);
    
    public Alimento buscarPorId(int idAlimento);
    


}
