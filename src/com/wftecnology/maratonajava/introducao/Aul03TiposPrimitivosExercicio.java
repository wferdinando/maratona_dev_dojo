package com.wftecnology.maratonajava.introducao;

/*
    Prática
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
    Eu<nome>, morando no endereço<endereco>, confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aul03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Willyan Ferdinando";
        String endereco = "Rua Joaquim Carula, 715 - Centro - Campina da Lagoa - PR";
        double salario = 5000.00D;
        String dataRecebimento = "05/09/2022";
        String relatorio = "Eu " +nome+", morando no endereco "+endereco+", confirmo que recebi o salario de "+salario+", na data "+dataRecebimento;
        System.out.println(relatorio);
    }


}
