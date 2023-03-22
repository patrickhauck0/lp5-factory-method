package factorymethod;

public class ServicoGabinete implements IServico {
    public String solicitarpeca() {return "Solicitação de reposição do gabinete confirmado.";}
    public String encaminharproducao() {return "Os gabinetes foram encaminhados com sucesso!";}
}
