package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoGPUTest {
    @Test
    void deveSolicitarPeca() {
        IServico servico = ServicoFactory.obterServico("GPU");
        assertEquals("Solicitação de reposição da placa de vídeo confirmada.", servico.solicitarpeca());
    }

    @Test
    void deveEncaminharProducao() {
        IServico servico = ServicoFactory.obterServico("GPU");
        assertEquals("As placas de vídeo foram encaminhadas com sucesso!", servico.encaminharproducao());
    }
}