package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMemoriaTest {
    @Test
    void deveSolicitarPeca() {
        IServico servico = ServicoFactory.obterServico("Memoria");
        assertEquals("Solicitação de reposição da memória ram confirmada.", servico.solicitarpeca());
    }

    @Test
    void deveEncaminharProducao() {
        IServico servico = ServicoFactory.obterServico("Memoria");
        assertEquals("As memórias foram encaminhadas com sucesso!", servico.encaminharproducao());
    }
}