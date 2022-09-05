package com.wftecnology.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        /* Tipos primitivos: int, double, float, char, byte, short, long, boolean
           -> as Classes sempre com letras maiuscular
           -> variáveis inicia sempre a 1 letra minuscula
         */

        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idateByte = 10;
        short idateShort = 10;
        boolean Verdadeiro = true;
        boolean Falso = false;
        char caractere = '\u0041'; //A

        String nome = "Um grande Texto não tem limite para String";

        System.out.println("A idade é "+idade+" anos.");
        System.out.println(Verdadeiro);
        System.out.println("char " +caractere);

    }
}
