package br.com.cpardin.service;

public interface IContratoService {
    String salvar();
    ContratoService buscarPorId(int id);
    boolean excluirPorId(int id);
    boolean atualizar(ContratoService contrato);
}
