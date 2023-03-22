package factorymethod;

public class ServicoProcessador implements IServico {
    public String solicitarpeca() {return "Solicitação de reposição do processador confirmado.";}
    public String encaminharproducao() {return "Os processadores foram encaminhados com sucesso!";}
}
