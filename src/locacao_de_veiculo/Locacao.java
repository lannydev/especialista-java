package locacao_de_veiculo;

public class Locacao {

    private Veiculo veiculo;
    private int quandidadeDeDiarias;

    public Locacao(){

    }

    public Locacao(Veiculo veiculo, int quandidadeDeDiarias) {
        this.veiculo = veiculo;
        this.quandidadeDeDiarias = quandidadeDeDiarias;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQuandidadeDeDiarias() {
        return quandidadeDeDiarias;
    }

    public void setQuandidadeDeDiarias(int quandidadeDeDiarias) {
        this.quandidadeDeDiarias = quandidadeDeDiarias;
    }

    public double getValorDaDiaria() {
        return veiculo.getValorDaDiaria();
    }

    public double calcularValorTotalDediarias(){
        return getValorDaDiaria() * quandidadeDeDiarias;
    }

    public void reservarVeiculo(){
        veiculo.setDisponivel(false);
    }
}
