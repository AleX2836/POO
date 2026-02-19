package ProjetoConta;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();
    Scanner teclado = new Scanner(System.in);

    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int escolha;

        
     
        System.out.println("Escolha a opção a baixo");
        System.out.println("1 --> Cadastrar ");
        System.out.println("2 --> Depositar ");
        System.out.println("3 --> Sacar ");
        System.out.println("4 --> Consultar ");
        System.out.println("5 --> Sair do programa");
        System.out.println(cc.saldo);
        escolha = teclado.nextInt();

        if(escolha == 2){
            execDepositar();
        }    
        else if(escolha == 4){
            execConsultar();
        }

        System.out.println(cc.saldo);

       
    }
     public static void execSacar(){
    
    }

    public static void execDepositar(){

        double valor;

        System.out.println("Digite a quantidade a ser depositada: ");
        valor = teclado.nextDouble();
        cc.depositar(0);

    }

    public static void execConsultar(){
        cc.imprimir();
    }
    
    public static void execCadastrar(){

    }
}
            
        
        
    

