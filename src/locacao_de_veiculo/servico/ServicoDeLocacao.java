package locacao_de_veiculo.servico;

import locacao_de_veiculo.Locacao;

public class ServicoDeLocacao {

    //Lei de Demeter a classe deve ter conhecimento limitado de outras classes
    //o objeto deve ter o minimo possível sobre a estrutura de outros objetos.
    public void confirmarLocacao(Locacao locacao){
        //double totalDiarias = locacao.getVeiculo().getGrupo().getValorDaDiaria()* locacao.getQuandidadeDeDiarias();

       // double totalDiarias = locacao.getValorDaDiaria()
               // * locacao.getQuandidadeDeDiarias();

        double totalDiarias = locacao.calcularValorTotalDediarias();

        //locacao.getVeiculo().setDisponivel(false);

        locacao.reservarVeiculo();
    }
}
