package ProjetoComputador;

import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {
        
        Computador teste = new Computador();
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite a marca: " );
        teste.marca = teclado.nextLine();

        System.out.println("Digite a cor: " );
        teste.cor = teclado.nextLine();    

        System.out.println("Digite o modelo: " );
        teste.modelo = teclado.nextLine();

        System.out.println("Digite o numero de serie: " );
        teste.numeroSerie = teclado.nextLong();
        
        System.out.println("Digite o preco: " );
        teste.preco = teclado.nextDouble();

        System.out.println("-------------------------------------------------------------------------------");

        teste.calcularValor();
        teste.imprimir();
       



        System.out.println("-------------------------------------------------------------------------------");

        Computador teste2 = new Computador();


        System.out.println("Digite a marca: " );
        teste2.marca = teclado.next();

        System.out.println("Digite a cor: " );
        teste2.cor = teclado.next();    

        System.out.println("Digite o modelo: " );
        teste2.modelo = teclado.next();

        System.out.println("Digite o numero de serie: " );
        teste2.numeroSerie = teclado.nextLong();
        
        System.out.println("Digite o preco:" );
        teste2.preco = teclado.nextDouble();

        System.out.println("-------------------------------------------------------------------------------");



        /* 
        teste2.marca = "IBM";
        teste2.cor = "Preto";
        teste2.modelo = "Asus";
        teste2.numeroSerie = 2929;
        teste2.preco = 250;
        */

        teste2.calcularValor();

        
        teste2.alterarValor(10);
        
        teste2.imprimir();



    }
    
}
