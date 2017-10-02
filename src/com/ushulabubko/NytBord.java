package com.ushulabubko;


public class NytBord {

    public static void main(String[] args) {

        Bord bord1 = new Bord();

        bord1.setMateriale("Fyr træ");
        System.out.println("bord 1 er lavet af " + bord1.getMatriale());



        bord1.setAntalBordBen(10);
        System.out.println("bord 1 har " + bord1.getAntalBordBen() + " ben.");

    }
}
