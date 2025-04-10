public class Main {
    public static void main(String[] args) {

        Servico servico = new Servico();
        Bloco bloco = new Bloco();
        Conexao conexao = new Conexao();


        Servidor servidor = new Servidor();
        servidor.adicionar(servico);
        servidor.adicionar(conexao);

        ColecaoNosRede colecao = new ColecaoNosRede();
        colecao.adicionar(bloco);
        colecao.adicionar(servidor);

        NoRede noRede = new NoRede();
        noRede.adicionar(colecao);

        noRede.exibirInformacoes();
    }
}
