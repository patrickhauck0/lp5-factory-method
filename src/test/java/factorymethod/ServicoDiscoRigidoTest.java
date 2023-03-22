package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDiscoRigidoTest {
    @Test
    void deveSolicitarPeca() {
        IServico servico = ServicoFactory.obterServico("DiscoRigido");
        assertEquals("Solicitação de reposição do disco rígido confirmado.", servico.solicitarpeca());
    }

    @Test
    void deveEncaminharProducao() {
        IServico servico = ServicoFactory.obterServico("DiscoRigido");
        assertEquals("Os discos rígidos foram encaminhados com sucesso!", servico.encaminharproducao());
    }
}