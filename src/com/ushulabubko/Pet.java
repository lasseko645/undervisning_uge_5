package com.ushulabubko;

public class Pet {

    String navn = "Nothing";
    double alder = 0.0;

    public void setAlder(double alder) {
        this.alder = alder;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getAlder() {
        return alder;
    }

    public String getNavn() {
        return navn;
    }
}
