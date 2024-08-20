package br.com.cpardin.test;

import br.com.cpardin.Cliente;
import br.com.cpardin.dao.ClienteDao;
import br.com.cpardin.dao.ClienteDaoMock;
import br.com.cpardin.dao.ContratoDaoMock;
import br.com.cpardin.dao.IContratoDao;
import br.com.cpardin.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;


public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarPorIdTest() {
        IContratoDao dao = new ContratoDaoMock();
        String resultado = dao.buscarPorId();
        Assert.assertNotNull(resultado);

    }

    @Test
    public void excluirPorIdTest() {
        IContratoDao dao = new ContratoDaoMock();
        boolean excluiu = dao.excluirPorId();
        Assert.assertTrue(excluiu);

    }

    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        Cliente cliente = new Cliente();
        boolean atualizou = dao.atualizar(cliente);
        Assert.assertTrue(atualizou);

    }
}