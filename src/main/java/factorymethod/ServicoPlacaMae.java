package factorymethod;

public class ServicoPlacaMae implements IServico {
    public String solicitarpeca() {return "Solicitação de reposição da placa mãe confirmada.";}
    public String encaminharproducao() {return "As placas mãe foram encaminhadas com sucesso!";}
}
