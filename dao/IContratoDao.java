package br.com.cpardin.dao;

import br.com.cpardin.Cliente;

public interface IContratoDao {
    String salvar();
    String buscarPorId(int id);
    boolean excluirPorId(int id);
    boolean atualizar(Cliente cliente);

    boolean excluirPorId();
}