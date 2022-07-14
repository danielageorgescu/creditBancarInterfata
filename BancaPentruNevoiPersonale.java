package com.itfactory.UnitateBancara;

import Persoana.Persoana;

public abstract class BancaPentruNevoiPersonale extends Persoana implements UnitateBancara{
    private int durata;

    public BancaPentruNevoiPersonale(double salariuNet, int durata) {
        super(salariuNet);
        this.durata = durata;
    }

// Clasa BancaPentruLocuinte
//- In aceasta banca creditul este salariul net al persoanei inmultit cu 100
//- Dobanda creditului este de 5%

    @Override
    public double Credit(){ System.out.println(getSalariuNet()*10);
        return 0;
    }

    @Override
    public double Dobanda() {
        System.out.println((getSalariuNet()*100)*0.08*durata/360);
    }
}
