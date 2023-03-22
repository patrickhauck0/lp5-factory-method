package factorymethod;

public class ServicoFonte implements IServico {
    public String solicitarpeca() {return "Solicitação de reposição da fonte confirmada.";}
    public String encaminharproducao() {return "As fontes foram encaminhadas com sucesso!";}
}
