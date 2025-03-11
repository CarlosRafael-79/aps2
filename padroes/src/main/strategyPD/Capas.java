package main.strategyPD;

import main.strategyPD.concreteStrategy.Dura;
import main.strategyPD.concreteStrategy.Ebook;
import main.strategyPD.concreteStrategy.Normal;
import main.strategyPD.strategy.TipoCapa;

public enum Capas {
    EBOOK{
        @Override
        public TipoCapa obterTipoCapa(){
            return new Ebook();
        }
    },
    NORMAL{
        @Override
        public TipoCapa obterTipoCapa(){
            return new Normal();
        }
    },
    DURA{
        @Override
        public TipoCapa obterTipoCapa(){
            return new Dura();
        }
    };

    public abstract TipoCapa obterTipoCapa();
}
