package locacao_de_veiculo;

public class GrupoVeiculo {

    private String nome;
    private double valorDaDiaria;

    public GrupoVeiculo(){

    }

    public GrupoVeiculo(String nome, double valorDaDiaria) {
        this.nome = nome;
        this.valorDaDiaria = valorDaDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDaDiaria() {
        return valorDaDiaria;
    }

    public void setValorDaDiaria(double valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }
}
