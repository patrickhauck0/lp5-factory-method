package factorymethod;

public class ServicoDiscoRigido implements IServico {
    public String solicitarpeca() {return "Solicitação de reposição do disco rígido confirmado.";}
    public String encaminharproducao() {return "Os discos rígidos foram encaminhados com sucesso!";}
}
