package construtores;

import java.util.Objects;
import java.util.Queue;

public class Produto {

    static final int ESTOQUE_INICIAL = 10;
    String nome;
    int qantidadeEmEstoque;
    double valor;

    Produto(){
        this("Pessoa Qualquer");

    }

    public Produto(String nome) {
       this(nome, ESTOQUE_INICIAL);
    }

    public Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        this.nome = nome;
        this.qantidadeEmEstoque = estoqueInicial;
    }


}
