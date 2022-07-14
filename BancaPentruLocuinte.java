package com.itfactory.UnitateBancara;

public abstract class BancaPentruLocuinte extends UnitateBancara{


    public BancaPentruLocuinte(double salariuNet, int durata) {
        super(salariuNet, durata);
    }


// Clasa BancaPentruLocuinte
//- In aceasta banca creditul este salariul net al persoanei inmultit cu 100
//- Dobanda creditului este de 5%

    @Override
    double Credit() {
       return salariuNet*100;
    }

    @Override
    double Dobanda(){
        return 0.05;



}

    public abstract void Credit(double credit);

    public abstract void Dobanda(double dobanda);
}



