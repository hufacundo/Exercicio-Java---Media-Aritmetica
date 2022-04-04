package br.uniesp.POO.Ted2;

import java.util.Scanner;

public class Media {

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        double nota1, nota2, nota3;
        double soma = 0;
        double media;
        double recuperacao;
        double prova_final;

        System.out.println("Sua primeira nota é: ");
        nota1 = a.nextDouble();
        System.out.println("Sua segunda nota é: ");
        nota2 = a.nextDouble();
        System.out.println("Sua terceira nota é: ");
        nota3 = a.nextDouble();

        soma = nota1 + nota2 + nota3;
        media = soma / 3;
        System.out.println("Sua media é: " +media);
        recuperacao = 10 - media + 2;
        prova_final = 10 + media;

        if ((media >= 0) && (media <= 4.9)){
            System.out.println("Você está em Recuperação!!!");
            System.out.println("Se faz necessário, " +recuperacao+ " para ser APROVADO.");
                    }
        else if((media >= 5) && (media <= 6.9)){
            System.out.println("Você irá realizar a prova FINAL!!!" );
            System.out.println("Se faz necessário, " +prova_final+ " para ser APROVADO.");
                    }

        else {
            System.out.println("Parabéns, você passou por MÉDIA!!!");
        }

    }

}
