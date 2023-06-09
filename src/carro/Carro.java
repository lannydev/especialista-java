package carro;

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

    public double calcularIpva(){

        int tempoDeUso = calcularTempoDeUsoEmAnos();
        if (tempoDeUso >= 10){
            return 0;
        }

        return calcularValorRevenda() * 0.04;
    }

    public void imprirResumoDepreciacao(){
        if (precoCompra <= 0){
            System.out.println("Valor de compra zerado, não é possível imprimir depreciação");
            return;
        }else {
            System.out.printf("Valor de revenda: %6.2f%n", calcularValorRevenda());
            System.out.println("Meu tempo de uso " + calcularTempoDeUsoEmAnos());
            System.out.printf("Valor de IPVA: %6.2f%n", calcularIpva());
        }
    }

    public int calcularTempoDeUsoEmAnos(){
        return anoAtual - anoFabricacao;
    }

    public double calcularValorRevenda(){
        int tempoDeUdoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUdoEmAnos);

        if (valorRevenda < 0){
            valorRevenda = 0;
        }

        //System.out.printf("Tempo de uso (anos): %d%n", tempoDeUdoEmAnos);
       // System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);

        return valorRevenda;

    }
}
