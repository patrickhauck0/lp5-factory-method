package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {
    @Test
    void deveRetornarServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Computador");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Memoria");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}