package factorymethod;

public class ServicoGPU implements IServico {
    public String solicitarpeca() {return "Solicitação de reposição da placa de vídeo confirmada.";}
    public String encaminharproducao() {return "As placas de vídeo foram encaminhadas com sucesso!";}
}
