package br.com.cpardin.dao;

import br.com.cpardin.Cliente;

public interface IClienteDao {

    public String salvar();

    String buscarPorId(int id);
    boolean excluirPorId(int id);
    boolean atualizar(Cliente cliente);
}

