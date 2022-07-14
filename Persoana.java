package Persoana;

public class Persoana {
    private String numePrenume;
    private int varsta;
    private long CNP;
    protected double salariuNet;

    public void PersoanaComplet ( String numePrenume,int varsta, long CNP, double salariuNet){
        this.numePrenume= numePrenume;
        this.varsta = varsta;
        this.CNP = CNP;
        this.salariuNet= salariuNet;
    }
    public Persoana (double salariuNet){
        this.salariuNet = salariuNet;
      }



    public String getNumePrenume() {
        return numePrenume;
    }

    public void setNumePrenume(String numePrenume) {
        this.numePrenume = numePrenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public long getCNP() {
        return CNP;
    }

    public void setCNP(long CNP) {
        this.CNP = CNP;
    }

    public double getSalariuNet() {
        return salariuNet;
    }

    public void setSalariuNet(double salariuNet) {
        this.salariuNet = salariuNet;
    }

}
