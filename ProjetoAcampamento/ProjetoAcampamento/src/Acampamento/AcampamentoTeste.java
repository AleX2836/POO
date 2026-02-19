package Acampamento;

import java.util.Scanner;

public class AcampamentoTeste {


    public static void main(String[] args) {
        

        Acampamento membroDaClasseAcampamento = new Acampamento();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        membroDaClasseAcampamento.nome = teclado.nextLine();

        System.out.println("Qual a sua idade: ");
        membroDaClasseAcampamento.idade = teclado.nextInt();

        membroDaClasseAcampamento.separarGrupo();

        membroDaClasseAcampamento.imprimir();

    }
    
}
