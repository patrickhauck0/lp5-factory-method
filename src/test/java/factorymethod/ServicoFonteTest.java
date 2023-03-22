package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFonteTest {
    @Test
    void deveSolicitarPeca() {
        IServico servico = ServicoFactory.obterServico("Fonte");
        assertEquals("Solicitação de reposição da fonte confirmada.", servico.solicitarpeca());
    }

    @Test
    void deveEncaminharProducao() {
        IServico servico = ServicoFactory.obterServico("Fonte");
        assertEquals("As fontes foram encaminhadas com sucesso!", servico.encaminharproducao());
    }
}