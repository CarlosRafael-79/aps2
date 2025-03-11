package main.strategyPD.contextVariant;

import main.strategyPD.strategy.TipoCapa;

public class Livro {

    private String nome;
    private double valor;
    private TipoCapa tipoCapa;

    public Livro(String nome, double valor, TipoCapa tipoCapa){
        this.nome = nome;
        this.valor = valor;
        this.tipoCapa = tipoCapa;
    }

    public void exibirInfo (){
        System.out.println("O livro "+this.nome+" custa R$ "+ tipoCapa.retornarValorTotal(this.valor));
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoCapa getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
    }
}
