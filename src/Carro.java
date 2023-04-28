public class Carro {

    private String fabricante;
    private String modelo;
    private Integer anoFabricacao;
    private Double precoCompra;

    private Integer anoAtual;
    //usando a composição.
    Proprietario proprietario;


    private String cor;

    public Carro(){
        super();
    }
    public Carro(String fabricante, String modelo, Integer anoFabricacao, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Integer getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(Integer anoAtual) {
        this.anoAtual = anoAtual;
    }

    public void calcularValorRevenda(){
        int tempoDeUdoEmAnos = anoAtual - anoFabricacao;
        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUdoEmAnos);

        if (valorRevenda < 0){
            valorRevenda = 0;
        }

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUdoEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);

    }
}
