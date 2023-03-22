package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoGabineteTest {
    @Test
    void deveSolicitarPeca() {
        IServico servico = ServicoFactory.obterServico("Gabinete");
        assertEquals("Solicitação de reposição do gabinete confirmado.", servico.solicitarpeca());
    }

    @Test
    void deveEncaminharProducao() {
        IServico servico = ServicoFactory.obterServico("Gabinete");
        assertEquals("Os gabinetes foram encaminhados com sucesso!", servico.encaminharproducao());
    }
}
