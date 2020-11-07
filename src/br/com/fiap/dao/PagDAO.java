package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Pagamento;

public interface PagDAO {
	
	public List<Pagamento> listarTodos();
	
	public void cadastrar(Pagamento pagamento);
  	    
    public void atualizar(Pagamento pagamento);
  
    public void remover(int idPagamento);
    
    public Pagamento buscarPorId(int idPagamento);

}
