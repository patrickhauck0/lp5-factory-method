package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPlacaMaeTest {
    @Test
    void deveEnviarCaminhao() {
        IServico servico = ServicoFactory.obterServico("PlacaMae");
        assertEquals("Solicitação de reposição da placa mãe confirmada.", servico.solicitarpeca());
    }

    @Test
    void deveRecolherCaminhao() {
        IServico servico = ServicoFactory.obterServico("PlacaMae");
        assertEquals("As placas mãe foram encaminhadas com sucesso!", servico.encaminharproducao());
    }
}