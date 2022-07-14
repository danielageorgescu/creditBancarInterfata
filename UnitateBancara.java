package com.itfactory.UnitateBancara;

import Persoana.Persoana;

public abstract class UnitateBancara extends Persoana{
    int durata;
    public UnitateBancara(double salariuNet, int durata) {
        super(salariuNet);
        this.durata = durata;
    }

    abstract double Credit();
    public double calculCredit(double Credit){
        return  Credit* getSalariuNet();
    }
   abstract double Dobanda();
    public double calculDobanda (double Dobanda){
        return (getSalariuNet()*100)*Dobanda*durata/360;
    }
}
