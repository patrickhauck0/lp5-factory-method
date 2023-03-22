package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoProcessadorTest {
    @Test
    void deveSolicitarPeca() {
        IServico servico = ServicoFactory.obterServico("Processador");
        assertEquals("Solicitação de reposição do processador confirmado.", servico.solicitarpeca());
    }

    @Test
    void deveEncaminharProducao() {
        IServico servico = ServicoFactory.obterServico("Processador");
        assertEquals("Os processadores foram encaminhados com sucesso!", servico.encaminharproducao());
    }
}