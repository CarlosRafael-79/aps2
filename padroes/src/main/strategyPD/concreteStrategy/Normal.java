package main.strategyPD.concreteStrategy;

import main.strategyPD.strategy.TipoCapa;

public class Normal implements TipoCapa {

    public double retornarValorTotal(double valorBase){
        return valorBase * 2.0;
    }
}
