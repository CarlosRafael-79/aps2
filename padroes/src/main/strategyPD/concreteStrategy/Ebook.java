package main.strategyPD.concreteStrategy;


import main.strategyPD.strategy.TipoCapa;

public class Ebook implements TipoCapa {

    public double retornarValorTotal(double valorBase){
        return valorBase;
    }
}
