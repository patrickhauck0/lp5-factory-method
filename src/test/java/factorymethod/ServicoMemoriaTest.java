package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMemoriaTest {
    @Test
    void deveEnviarCaminhao() {
        IServico servico = ServicoFactory.obterServico("Memoria");
        assertEquals("Solicitação de reposição da memória ram confirmada.", servico.solicitarpeca());
    }

    @Test
    void deveRecolherCaminhao() {
        IServico servico = ServicoFactory.obterServico("Memoria");
        assertEquals("As memórias foram encaminhadas com sucesso!", servico.encaminharproducao());
    }
}